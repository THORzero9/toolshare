package com.bhaswat.toolshare.di

import com.bhaswat.toolshare.data.remote.ToolShareApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://your-backend-url.com/") // TODO: Replace with actual backend URL
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    fun provideToolShareApiService(retrofit: Retrofit): ToolShareApiService {
        return retrofit.create(ToolShareApiService::class.java)
    }
}
