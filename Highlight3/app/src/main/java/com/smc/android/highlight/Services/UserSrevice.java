package com.smc.android.highlight.Services;

import com.smc.android.highlight.Models.UserModel;
import com.smc.android.highlight.Models.DummyDaraSource;

import java.util.List;

public class UserSrevice {


    static boolean TEST_MODE = true;


    //Login'

    // Logout

    // Fetch user info
    // - bio                                                // 정보에는 뭐 로그인기능있고,로그아웃기능있고 유저정보찾기 , 프로썸네일 이런거 있고
    // -profile thumbnail

    public static List<UserModel> FetchAllUser(){
        if (TEST_MODE){
            return DummyDaraSource.DummyUsers;
        }                                                               //서버에 요청넣었는데 서버와 연결이안되있으면  더미유저보냄
        else {
            //REAL LOGIC
                                    //여기에 Retrofic 소스넣기
            return null;
        }
    }



}
