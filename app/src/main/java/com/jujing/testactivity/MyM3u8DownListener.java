package com.jujing.testactivity;

import jaygoo.library.m3u8downloader.OnM3U8DownloadListener;
import jaygoo.library.m3u8downloader.bean.M3U8Task;

public class MyM3u8DownListener extends OnM3U8DownloadListener {
    OnDownLoadListener onDownLoadListener;
    public MyM3u8DownListener(OnDownLoadListener downLoadListener){
        this.onDownLoadListener=downLoadListener;
    }
    public interface OnDownLoadListener{
        //切片下载
        public void onDownloadItem(M3U8Task task, long itemFileSize, int totalTs, int curTs) ;

        public void onDownloadSuccess(M3U8Task task) ;

        public void onDownloadPause(M3U8Task task) ;

        public void onDownloadPending(M3U8Task task) ;

        /**
         * 异步回调，不可以直接在UI线程调用
         * @param task
         */
        public void onDownloadProgress(M3U8Task task) ;

        public void onDownloadPrepare(M3U8Task task) ;

        /**
         * 线程环境无法保证，不可以直接在UI线程调用
         * @param task
         */
        public void onDownloadError(M3U8Task task, Throwable errorMsg) ;
    }

    //切片下载
    public void onDownloadItem(M3U8Task task, long itemFileSize, int totalTs, int curTs) {
        onDownLoadListener.onDownloadItem(task,itemFileSize,totalTs,curTs);
    }

    public void onDownloadSuccess(M3U8Task task) {
        onDownLoadListener.onDownloadSuccess(task);
    }

    public void onDownloadPause(M3U8Task task) {
        onDownLoadListener.onDownloadPause(task);
    }

    public void onDownloadPending(M3U8Task task) {
        onDownLoadListener.onDownloadPending(task);
    }

    /**
     * 异步回调，不可以直接在UI线程调用
     * @param task
     */
    public void onDownloadProgress(M3U8Task task) {
        onDownLoadListener.onDownloadProgress(task);
    }

    public void onDownloadPrepare(M3U8Task task) {
        onDownLoadListener.onDownloadPrepare(task);
    }

    /**
     * 线程环境无法保证，不可以直接在UI线程调用
     * @param task
     */
    public void onDownloadError(M3U8Task task, Throwable errorMsg) {
        onDownLoadListener.onDownloadError(task,errorMsg);
    }
}
