SCRIPT_START
{
LVAR_INT scplayer
LVAR_INT iModel hObject pLabel bActive
LVAR_FLOAT x y z

CONST_FLOAT GET_OBJ_RADIUS 150.0

///////////////////////////////////////////////////////////////////////////////////////////////////

REQUIRE StoreObj.sc

GET_PLAYER_CHAR 0 scplayer

///////////////////////////////////////////////////////////////////////////////////////////////////

main_loop:
WAIT 0
IF IS_PLAYER_PLAYING 0

    //---------- Triggers

    //-- Locations
    IF GOSUB CheckStart_House1
        STREAM_CUSTOM_SCRIPT "CLEO/Urbanize/House1.cs" (pLabel)
    ENDIF
    IF GOSUB CheckStart_House2
        STREAM_CUSTOM_SCRIPT "CLEO/Urbanize/House2.cs" (pLabel)
    ENDIF
    IF GOSUB CheckStart_Queue1
        STREAM_CUSTOM_SCRIPT "CLEO/Urbanize/Queue1.cs" (pLabel)
    ENDIF


    //-- Objects
    GET_CHAR_COORDINATES scplayer (x y z)

    IF GET_RANDOM_OBJECT_IN_SPHERE_NO_SAVE_RECURSIVE (x y z) (GET_OBJ_RADIUS) (FALSE) hObject
        for_all_objects_loop:
        GET_OBJECT_MODEL  hObject iModel
        /////////////////////////////////////////

        IF iModel = 643 //kb_chr_tbl_test (mesa 4 cadeiras)
            GET_LABEL_POINTER RunningList_Table1 (pLabel)
            IF CLEO_CALL CheckStore_Object 0 (pLabel, hObject)
                STREAM_CUSTOM_SCRIPT "CLEO/Urbanize/Table1.cs" (pLabel)
            ENDIF
        ENDIF

        IF iModel = 1415 //dyn_dumpster (entulhos)
            GET_LABEL_POINTER RunningList_Dump1 (pLabel)
            IF CLEO_CALL CheckStore_Object 0 (pLabel, hObject)
                STREAM_CUSTOM_SCRIPT "CLEO/Urbanize/Dump1.cs" (pLabel)
            ENDIF
        ENDIF

        /////////////////////////////////////////
        IF GET_RANDOM_OBJECT_IN_SPHERE_NO_SAVE_RECURSIVE (x y z) (GET_OBJ_RADIUS) (FALSE) hObject
            GOTO for_all_objects_loop
        ENDIF
    ENDIF

    //---------- End of Triggers

ENDIF
GOTO main_loop

///////////////////////////////////////////////////////////////////////////////////////////////////


//------- House 1 -------//
CheckStart_House1:
CONST_FLOAT HOUSE1_X 305.2728 
CONST_FLOAT HOUSE1_Y -1768.9983
CONST_FLOAT HOUSE1_Z 7.6797
CONST_FLOAT HOUSE1_R 200.0
IF LOCATE_CHAR_ANY_MEANS_3D scplayer (HOUSE1_X HOUSE1_Y HOUSE1_Z) (HOUSE1_R HOUSE1_R HOUSE1_R) 0
    GET_LABEL_POINTER Running_House1 (pLabel)
    READ_MEMORY pLabel 1 FALSE (bActive)
    IF bActive = FALSE
        WRITE_MEMORY pLabel 4 bActive FALSE
        IS_PC_VERSION
        RETURN
    ENDIF
ENDIF
IS_AUSTRALIAN_GAME
RETURN

Running_House1:
DUMP
00
ENDDUMP


//------- House 2 -------//
CheckStart_House2:
CONST_FLOAT HOUSE2_X 305.2728 
CONST_FLOAT HOUSE2_Y -1768.9983
CONST_FLOAT HOUSE2_Z 7.6797
CONST_FLOAT HOUSE2_R 200.0
IF LOCATE_CHAR_ANY_MEANS_3D scplayer (HOUSE2_X HOUSE2_Y HOUSE2_Z) (HOUSE2_R HOUSE2_R HOUSE2_R) 0
    GET_LABEL_POINTER Running_House2 (pLabel)
    READ_MEMORY pLabel 1 FALSE (bActive)
    IF bActive = FALSE
        WRITE_MEMORY pLabel 4 bActive FALSE
        IS_PC_VERSION
        RETURN
    ENDIF
ENDIF
IS_AUSTRALIAN_GAME
RETURN

Running_House2:
DUMP
00
ENDDUMP


//------- Queue 1 -------//
CheckStart_Queue1:
CONST_FLOAT QUEUE1_X 305.2728 
CONST_FLOAT QUEUE1_Y -1768.9983
CONST_FLOAT QUEUE1_Z 7.6797
CONST_FLOAT QUEUE1_R 200.0
IF LOCATE_CHAR_ANY_MEANS_3D scplayer (QUEUE1_X QUEUE1_Y QUEUE1_Z) (QUEUE1_R QUEUE1_R QUEUE1_R) 0
    GET_LABEL_POINTER Running_Queue1 (pLabel)
    READ_MEMORY pLabel 1 FALSE (bActive)
    IF bActive = FALSE
        WRITE_MEMORY pLabel 4 bActive FALSE
        IS_PC_VERSION
        RETURN
    ENDIF
ENDIF
IS_AUSTRALIAN_GAME
RETURN

Running_Queue1:
DUMP
00
ENDDUMP

///////////////////////////////////////////////////////////////////////////////////////////////////

RunningList_Table1: // 16 slots
DUMP
00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 
00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 
00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 
00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00
ENDDUMP

RunningList_Dump1: // 16 slots
DUMP
00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 
00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 
00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 
00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00
ENDDUMP

///////////////////////////////////////////////////////////////////////////////////////////////////


}
SCRIPT_END