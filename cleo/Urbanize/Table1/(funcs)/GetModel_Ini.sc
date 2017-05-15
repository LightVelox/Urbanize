{
    LVAR_TEXT_LABEL16 sTypeName
    LVAR_INT iNum iRandom iModel iTries
    
    GetModel:
    READ_INT_FROM_INI_FILE ("CLEO\Urbanize\Models.ini" sTypeName "Num") iNum
    iNum++
    get_random_model:
    GENERATE_RANDOM_INT_IN_RANGE (1 iNum) iRandom
    STRING_FORMAT sModelNum "Model%i" iRandom
    READ_INT_FROM_INI_FILE ("CLEO\Urbanize\Models.ini" sTypeName sModelNum) iModel
    IF NOT IS_MODEL_IN_CDIMAGE iModel
        iTries++
        IF iTries > iNum
            CLEO_RETURN 0 (7) //MALE01
        ENDIF
        GOTO get_random_model
    ENDIF
    CLEO_RETURN 0 (iModel)
}