package com.example.shin.disposisi.FileSeksi;

import com.example.shin.disposisi.Server;
import com.example.shin.disposisi.Surat;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiSeksi {
    String BASE_URL = Server.IP;
    @GET("seksi.php")
    Call<List<Surat>> getData();
}
