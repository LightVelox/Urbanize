{
    /*
    Usage:
        https://github.com/JuniorDjjr/Urbanize/wiki/Obtendo-os-modelos-de-peds-dinamicamente
    Example:
        CLEO_CALL GetModel_Ini 0 (1)(iModelVendor1) // Vendors
    */
    LVAR_INT iTypeID // In
    LVAR_TEXT_LABEL sTypeName
    LVAR_TEXT_LABEL sModelNum
    LVAR_INT iNum iRandom iModel iTries iMaxTries
    
    GetModel_Ini:
    
    SWITCH iTypeID
        CASE 1
            sTypeName = Vendors
            BREAK
        CASE 2
            sTypeName = Prostit
            BREAK
        CASE 3
            sTypeName = Skate
            BREAK
    ENDSWITCH

    READ_INT_FROM_INI_FILE ("CLEO\Urbanize\Models.ini" $sTypeName "Num") iNum
    iNum++
    get_random_model:
    GENERATE_RANDOM_INT_IN_RANGE (1 iNum) iRandom
    STRING_FORMAT sModelNum "Model%i" iRandom
    READ_INT_FROM_INI_FILE ("CLEO\Urbanize\Models.ini" $sTypeName $sModelNum) iModel
    IF NOT IS_MODEL_IN_CDIMAGE iModel // Try again if model isn't installed
        iTries++
        iMaxTries = iNum * 2
        IF iTries > iMaxTries
            CLEO_RETURN 0 (7) //MALE01
        ENDIF
        GOTO get_random_model
    ENDIF
    CLEO_RETURN 0 (iModel)
}