{
    LVAR_INT pOffset // In
    LVAR_INT hInObject // In
    LVAR_INT hMemObject

    Remove_Object:
    READ_MEMORY pOffset 4 FALSE (hMemObject)
    IF hMemObject = 0xFFFFFF // End of memory
        // Object was not found in memory (something wrong!)
        PRINT_STRING_NOW "~r~Remove_Object: Object was not found." 10000
        CLEO_RETURN 0
    ENDIF
    IF hMemObject = hInObject // The object is already in memory and activated
        WRITE_MEMORY pOffset 4 0 FALSE
        PRINT_STRING_NOW "Remove_Object: Object removed from memory" 1000
        CLEO_RETURN 0
    ENDIF
    pOffset += 4
    GOTO Remove_Object
}
