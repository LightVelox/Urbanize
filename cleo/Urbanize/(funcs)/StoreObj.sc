{
LVAR_INT pOffset // In
LVAR_INT hInObject // In
LVAR_INT hMemObject
LVAR_INT pFreeSlot

CheckStore_Object:
READ_MEMORY pOffset 4 FALSE (hMemObject)
IF hMemObject = 0xFFFFFF // End of memory
    IF pFreeSlot > 0 // Was found free slot to store the object
        WRITE_MEMORY pFreeSlot 4 hInObject FALSE
        IS_PC_VERSION
    ELSE
        IS_AUSTRALIAN_GAME
    ENDIF
    CLEO_RETURN 0
ENDIF
IF hMemObject = hInObject // The object is already in memory and activated
    IS_AUSTRALIAN_GAME
    CLEO_RETURN 0
ENDIF
IF hMemObject = 0
    pFreeSlot = pOffset // Found free slot
ENDIF
GOTO CheckStore_Object

}
