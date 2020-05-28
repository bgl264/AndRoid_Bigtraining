package com.bgl.databean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

import java.util.List;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by 包国梁 on 2020/5/28  16:33
 */

@Entity
public class DatasBean {
    /**
     * id : 33
     * thumbnail : https://img.owspace.com/Public/uploads/Picture/2020-02-01/5e353606af2eb.jpeg
     * title : 单读·启示录
     * description : 如实写下了你们的所见所闻，这会是一份真挚而沉重的纪录，我们会留存它。

     投稿邮箱：anonymous@owspace.com
     * model : 11
     * uid : 907331
     * name :
     * excerpt : 就像纳粹党从舆论反犹到“水晶之夜”，从言论的暴力到行动的暴力，只有一步之遥。
     * lead : 公开信（ Republic of letters ）是单读的开放栏目。我们欢迎来自不同背景、住在不同国家的作者，在这里向彼此写信，分享他们最近的生活、关心的议题、以及世界上重要的事。
     今天这封信，是单读编辑沈律君写给另一位单读编辑张頔的回信，围绕“冠姓权”与言论自由，沈律君给出了他的观察与思考。两位编辑的观点多有不同，甚至对立，但他们同时期望让表达继续，而不只是表态。
     * position : 0
     * create_time : 1590625800
     * update_time : 2020/05/28
     * tags : [{"name":""}]
     * status : 1
     * video :
     * fm :
     * link_url :
     * publish_time : 0
     * view : 1.3w
     * share : http://static.owspace.com/wap/296906.html
     * comment : 4
     * good : 15
     * bookmark : 0
     * show_uid : 907331
     * fm_play :
     * lunar_type : 1
     * html5 : http://static.owspace.com/wap/296906.html
     * author : 公开信
     * tpl : 1
     * avatar : https://img.owspace.com/Public/static/avatar/1.png
     * category : TO READ
     * hot_comments : []
     * parseXML : 1
     * nickname :
     * total_url :
     */

    @Id
    private Long db_id;

    private String id;
    private String thumbnail;
    private String title;
    private String description;
    private int model;
    private String uid;
    private String name;
    private String excerpt;
    private String lead;
    private String position;
    private String create_time;
    private String update_time;
    private String status;
    private String video;
    private String fm;
    private String link_url;
    private String publish_time;
    private String view;
    private String share;
    private String comment;
    private String good;
    private String bookmark;
    private String show_uid;
    private String fm_play;
    private String lunar_type;
    private String html5;
    private String author;
    private int tpl;
    private String avatar;
    private String category;
    private int parseXML;
    private String nickname;
    private String total_url;

    @Generated(hash = 1665912378)
    public DatasBean(Long db_id, String id, String thumbnail, String title, String description, int model,
            String uid, String name, String excerpt, String lead, String position, String create_time,
            String update_time, String status, String video, String fm, String link_url, String publish_time,
            String view, String share, String comment, String good, String bookmark, String show_uid,
            String fm_play, String lunar_type, String html5, String author, int tpl, String avatar,
            String category, int parseXML, String nickname, String total_url) {
        this.db_id = db_id;
        this.id = id;
        this.thumbnail = thumbnail;
        this.title = title;
        this.description = description;
        this.model = model;
        this.uid = uid;
        this.name = name;
        this.excerpt = excerpt;
        this.lead = lead;
        this.position = position;
        this.create_time = create_time;
        this.update_time = update_time;
        this.status = status;
        this.video = video;
        this.fm = fm;
        this.link_url = link_url;
        this.publish_time = publish_time;
        this.view = view;
        this.share = share;
        this.comment = comment;
        this.good = good;
        this.bookmark = bookmark;
        this.show_uid = show_uid;
        this.fm_play = fm_play;
        this.lunar_type = lunar_type;
        this.html5 = html5;
        this.author = author;
        this.tpl = tpl;
        this.avatar = avatar;
        this.category = category;
        this.parseXML = parseXML;
        this.nickname = nickname;
        this.total_url = total_url;
    }

    @Generated(hash = 128729784)
    public DatasBean() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExcerpt() {
        return excerpt;
    }

    public void setExcerpt(String excerpt) {
        this.excerpt = excerpt;
    }

    public String getLead() {
        return lead;
    }

    public void setLead(String lead) {
        this.lead = lead;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getFm() {
        return fm;
    }

    public void setFm(String fm) {
        this.fm = fm;
    }

    public String getLink_url() {
        return link_url;
    }

    public void setLink_url(String link_url) {
        this.link_url = link_url;
    }

    public String getPublish_time() {
        return publish_time;
    }

    public void setPublish_time(String publish_time) {
        this.publish_time = publish_time;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public String getShare() {
        return share;
    }

    public void setShare(String share) {
        this.share = share;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getGood() {
        return good;
    }

    public void setGood(String good) {
        this.good = good;
    }

    public String getBookmark() {
        return bookmark;
    }

    public void setBookmark(String bookmark) {
        this.bookmark = bookmark;
    }

    public String getShow_uid() {
        return show_uid;
    }

    public void setShow_uid(String show_uid) {
        this.show_uid = show_uid;
    }

    public String getFm_play() {
        return fm_play;
    }

    public void setFm_play(String fm_play) {
        this.fm_play = fm_play;
    }

    public String getLunar_type() {
        return lunar_type;
    }

    public void setLunar_type(String lunar_type) {
        this.lunar_type = lunar_type;
    }

    public String getHtml5() {
        return html5;
    }

    public void setHtml5(String html5) {
        this.html5 = html5;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getTpl() {
        return tpl;
    }

    public void setTpl(int tpl) {
        this.tpl = tpl;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getParseXML() {
        return parseXML;
    }

    public void setParseXML(int parseXML) {
        this.parseXML = parseXML;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getTotal_url() {
        return total_url;
    }

    public void setTotal_url(String total_url) {
        this.total_url = total_url;
    }

    public Long getDb_id() {
        return this.db_id;
    }

    public void setDb_id(Long db_id) {
        this.db_id = db_id;
    }
}
