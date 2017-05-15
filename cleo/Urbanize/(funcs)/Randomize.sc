{
    /*
    Usage:
        IF CLEO_CALL Randomize 0 (percent)
    Example:
        IF CLEO_CALL Randomize 0 (50) // 50% of chances to return true
    */
    LVAR_INT iPercent // In
    LVAR_INT iEnd iRandom

    Randomize:
    GENERATE_RANDOM_INT_IN_RANGE 0 100 (iRandom)
    IS_THING_GREATER_THAN_THING iPercent iRandom
    CLEO_RETURN 0
}