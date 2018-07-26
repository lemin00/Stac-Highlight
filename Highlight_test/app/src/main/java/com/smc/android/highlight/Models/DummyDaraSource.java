package com.smc.android.highlight.Models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DummyDaraSource {




    public static UserModel GenRandomUser(){


        Random rand = new Random();

        int  n = rand.nextInt(50) + 1;




        UserModel userModel = new UserModel();
        userModel.username = "foo";
        userModel.age = n;
        userModel.profileUrl = "https://ncache.ilbe.com/files/attach/new/20160521/377678/4024860240/8087853367/f5ba160f4f363e197b17094020f9813a.jpg";
        return userModel;
    }



    public static List<UserModel> DummyUsers = new ArrayList<>();

    public static List<UserModel> FetchDummyUsers(){

        for (int i =0; i< 50; i ++){
            DummyUsers.add(GenRandomUser());

        }

        return DummyUsers;

    }

}
