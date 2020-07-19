package com.example.likecountmvvmimdbmovies.model;

import java.lang.System;

/**
 * @author : Eduardo Medina
 * @since : 11/17/18
 * @see : https://developer.android.com/index.html
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b?\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u00a3\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\n\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0014\u001a\u00020\n\u0012\b\b\u0002\u0010\u0015\u001a\u00020\n\u00a2\u0006\u0002\u0010\u0016J\t\u0010?\u001a\u00020\u0003H\u00c6\u0003J\t\u0010@\u001a\u00020\nH\u00c6\u0003J\u0011\u0010A\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011H\u00c6\u0003J\t\u0010B\u001a\u00020\nH\u00c6\u0003J\t\u0010C\u001a\u00020\u0005H\u00c6\u0003J\t\u0010D\u001a\u00020\nH\u00c6\u0003J\t\u0010E\u001a\u00020\nH\u00c6\u0003J\t\u0010F\u001a\u00020\u0005H\u00c6\u0003J\t\u0010G\u001a\u00020\u0003H\u00c6\u0003J\t\u0010H\u001a\u00020\bH\u00c6\u0003J\t\u0010I\u001a\u00020\nH\u00c6\u0003J\t\u0010J\u001a\u00020\u0003H\u00c6\u0003J\t\u0010K\u001a\u00020\bH\u00c6\u0003J\t\u0010L\u001a\u00020\nH\u00c6\u0003J\t\u0010M\u001a\u00020\nH\u00c6\u0003J\u00a7\u0001\u0010N\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\n2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\nH\u00c6\u0001J\u0013\u0010O\u001a\u00020\b2\b\u0010P\u001a\u0004\u0018\u00010QH\u00d6\u0003J\t\u0010R\u001a\u00020\u0003H\u00d6\u0001J\t\u0010S\u001a\u00020\nH\u00d6\u0001R\u001a\u0010\f\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\r\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010$\"\u0004\b(\u0010&R\u001a\u0010\u000e\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001c\"\u0004\b*\u0010\u001eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001c\"\u0004\b,\u0010\u001eR\u001a\u0010\u0014\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001c\"\u0004\b.\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u001c\"\u0004\b4\u0010\u001eR\u001a\u0010\u0015\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u001c\"\u0004\b6\u0010\u001eR\u001a\u0010\u0012\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u001c\"\u0004\b8\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u0018\"\u0004\b:\u0010\u001aR\u001a\u0010\u0013\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u00100\"\u0004\b<\u00102R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010$\"\u0004\b>\u0010&\u00a8\u0006T"}, d2 = {"Lcom/example/likecountmvvmimdbmovies/model/Movie;", "Ljava/io/Serializable;", "likeCount", "", "popularity", "", "vote_count", "video", "", "poster_path", "", "id", "adult", "backdrop_path", "original_language", "original_title", "genre_ids", "", "title", "vote_average", "overview", "release_date", "(IDIZLjava/lang/String;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;)V", "getAdult", "()Z", "setAdult", "(Z)V", "getBackdrop_path", "()Ljava/lang/String;", "setBackdrop_path", "(Ljava/lang/String;)V", "getGenre_ids", "()Ljava/util/List;", "setGenre_ids", "(Ljava/util/List;)V", "getId", "()I", "setId", "(I)V", "getLikeCount", "setLikeCount", "getOriginal_language", "setOriginal_language", "getOriginal_title", "setOriginal_title", "getOverview", "setOverview", "getPopularity", "()D", "setPopularity", "(D)V", "getPoster_path", "setPoster_path", "getRelease_date", "setRelease_date", "getTitle", "setTitle", "getVideo", "setVideo", "getVote_average", "setVote_average", "getVote_count", "setVote_count", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "app_debug"})
public final class Movie implements java.io.Serializable {
    private int likeCount;
    private double popularity;
    private int vote_count;
    private boolean video;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String poster_path;
    private int id;
    private boolean adult;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String backdrop_path;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String original_language;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String original_title;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<java.lang.Integer> genre_ids;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String title;
    private double vote_average;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String overview;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String release_date;
    
    public final int getLikeCount() {
        return 0;
    }
    
    public final void setLikeCount(int p0) {
    }
    
    public final double getPopularity() {
        return 0.0;
    }
    
    public final void setPopularity(double p0) {
    }
    
    public final int getVote_count() {
        return 0;
    }
    
    public final void setVote_count(int p0) {
    }
    
    public final boolean getVideo() {
        return false;
    }
    
    public final void setVideo(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPoster_path() {
        return null;
    }
    
    public final void setPoster_path(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    public final boolean getAdult() {
        return false;
    }
    
    public final void setAdult(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBackdrop_path() {
        return null;
    }
    
    public final void setBackdrop_path(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOriginal_language() {
        return null;
    }
    
    public final void setOriginal_language(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOriginal_title() {
        return null;
    }
    
    public final void setOriginal_title(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Integer> getGenre_ids() {
        return null;
    }
    
    public final void setGenre_ids(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final double getVote_average() {
        return 0.0;
    }
    
    public final void setVote_average(double p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOverview() {
        return null;
    }
    
    public final void setOverview(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRelease_date() {
        return null;
    }
    
    public final void setRelease_date(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public Movie(int likeCount, double popularity, int vote_count, boolean video, @org.jetbrains.annotations.NotNull()
    java.lang.String poster_path, int id, boolean adult, @org.jetbrains.annotations.NotNull()
    java.lang.String backdrop_path, @org.jetbrains.annotations.NotNull()
    java.lang.String original_language, @org.jetbrains.annotations.NotNull()
    java.lang.String original_title, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Integer> genre_ids, @org.jetbrains.annotations.NotNull()
    java.lang.String title, double vote_average, @org.jetbrains.annotations.NotNull()
    java.lang.String overview, @org.jetbrains.annotations.NotNull()
    java.lang.String release_date) {
        super();
    }
    
    public Movie() {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final double component2() {
        return 0.0;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final boolean component4() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    public final int component6() {
        return 0;
    }
    
    public final boolean component7() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Integer> component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    public final double component13() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component15() {
        return null;
    }
    
    /**
     * @author : Eduardo Medina
     * @since : 11/17/18
     * @see : https://developer.android.com/index.html
     */
    @org.jetbrains.annotations.NotNull()
    public final com.example.likecountmvvmimdbmovies.model.Movie copy(int likeCount, double popularity, int vote_count, boolean video, @org.jetbrains.annotations.NotNull()
    java.lang.String poster_path, int id, boolean adult, @org.jetbrains.annotations.NotNull()
    java.lang.String backdrop_path, @org.jetbrains.annotations.NotNull()
    java.lang.String original_language, @org.jetbrains.annotations.NotNull()
    java.lang.String original_title, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Integer> genre_ids, @org.jetbrains.annotations.NotNull()
    java.lang.String title, double vote_average, @org.jetbrains.annotations.NotNull()
    java.lang.String overview, @org.jetbrains.annotations.NotNull()
    java.lang.String release_date) {
        return null;
    }
    
    /**
     * @author : Eduardo Medina
     * @since : 11/17/18
     * @see : https://developer.android.com/index.html
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * @author : Eduardo Medina
     * @since : 11/17/18
     * @see : https://developer.android.com/index.html
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * @author : Eduardo Medina
     * @since : 11/17/18
     * @see : https://developer.android.com/index.html
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}