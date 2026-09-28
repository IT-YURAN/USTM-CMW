package com.example.diarioderede;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

public class NetworkUtils {

    public static String getNetworkType(Context context){

        ConnectivityManager connectivityManager=(ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);

        Network network=connectivityManager.getActiveNetwork();
        if (network==null){
            return "Sem ligacao";
        }
        NetworkCapabilities capabilities =connectivityManager.getNetworkCapabilities(network);

        if (capabilities==null){
            return "Sem ligacao";
        }
        if (capabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI)){
            return "Wi-Fi";
        }
        if (capabilities.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR)){
            return "Dados Moveis";
        }

        return "Sem ligacao";
    };
}
