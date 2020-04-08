package com.jeffmony.downloader;

import android.content.Context;

import java.io.File;

public class VideoDownloadConfig {

    private Context mContext;
    private File mCacheRoot;
    private int mReadTimeOut;
    private int mConnTimeOut;
    private boolean mRedirect;
    private boolean mIgnoreAllCertErrors;
    private int mConcurrentCount;

    public VideoDownloadConfig(Context context, File cacheRoot, int readTimeOut,
                               int connTimeOut, boolean redirect, boolean ignoreAllCertErrors,
                               int concurrentCount) {
        mContext = context;
        mCacheRoot = cacheRoot;
        mReadTimeOut = readTimeOut;
        mConnTimeOut = connTimeOut;
        mRedirect = redirect;
        mIgnoreAllCertErrors = ignoreAllCertErrors;
        mConcurrentCount = concurrentCount;
    }

    public File getCacheRoot() {
        return mCacheRoot;
    }

    public int getReadTimeOut() {
        return mReadTimeOut;
    }

    public int getConnTimeOut() {
        return mConnTimeOut;
    }

    public boolean shouldRedirect() {
        return mRedirect;
    }

    public boolean shouldIgnoreCertErrors() {
        return mIgnoreAllCertErrors;
    }

    public int getConcurrentCount() {
        return mConcurrentCount;
    }
}
