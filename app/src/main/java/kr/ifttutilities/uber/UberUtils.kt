package kr.ifttutilities.uber

import com.uber.sdk.core.auth.Scope
import com.uber.sdk.rides.client.SessionConfiguration
import java.util.*

/**
 * Created by krishan on 08/03/18.
 */


object UberUtils {
    private const val redirectUri = "app://kr.iftt"
    // todo hide this secrets
    private const val clientId = "6RmHtzO5rvg1SbevhUo77odrEysAzCLK"
    const val accessToken = "KA.eyJ2ZXJzaW9uIjoyLCJpZCI6IkJuL1g0bWJQVHVxN2ZWUExkdkRSNGc9PSIsImV4cGlyZXNfYXQiOjE1MjM2MTcwNDMsInBpcGVsaW5lX2tleV9pZCI6Ik1RPT0iLCJwaXBlbGluZV9pZCI6MX0.FtULoui9-KxdvO4iklbv3NfmX-3JoBUuERzJg-O1cgk"

    @JvmStatic
    fun getUberSessionConfiguration(): SessionConfiguration {
        return SessionConfiguration.Builder()
                .setClientId(clientId)
                .setRedirectUri(redirectUri)
                .setEnvironment(SessionConfiguration.Environment.SANDBOX)
                .setScopes(Arrays.asList(Scope.PROFILE, Scope.REQUEST))
                .build()
    }

}

