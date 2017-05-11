SCRIPT_START
{
LVAR_INT scplayer

GET_PLAYER_CHAR 0 scplayer

///////////////////////////////////////////////////?///////////////////////////////////////////////

main_loop:
WAIT 0
IF IS_PLAYER_PLAYING 0

    //---------- Triggers

    //-- Locations
    IF GOSUB CheckStart_House1
        STREAM_CUSTOM_SCRIPT "CLEO/Urbanize/House1.cs"
    ENDIF
    IF GOSUB CheckStart_Queue1
        STREAM_CUSTOM_SCRIPT "CLEO/Urbanize/Queue1.cs"
    ENDIF

ENDIF
GOTO main_loop
}

///////////////////////////////////////////////////?///////////////////////////////////////////////

CheckStart_House1:
RETURN

CheckStart_House2:
RETURN

CheckStart_Queue1:
RETURN



SCRIPT_END