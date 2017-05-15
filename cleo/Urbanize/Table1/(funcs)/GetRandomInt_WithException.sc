{
    /*
    Usage:
        CLEO_CALL 0 GetRandomInt_WithException 0 (start, end, except)(return)
    Example:
        CLEO_CALL 0 GetRandomInt_WithException 0 (0 4, 1)(i) // Will get 0, 2 or 3 (but not 1)
    */
    LVAR_INT iStart iEnd iExcept // In
    LVAR_INT iRandom

    GetRandomInt_WithException:
    GENERATE_RANDOM_INT_IN_RANGE iStart iEnd (iRandom)
    IS_THING_EQUAL_TO_THING iRandom iExcept
    GOTO_IF_FALSE GetRandomInt_WithException
    CLEO_RETURN 0
}