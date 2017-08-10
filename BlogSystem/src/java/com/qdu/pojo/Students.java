package com.qdu.pojo;
// Generated 2017-7-31 11:30:17 by Hibernate Tools 4.3.1


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Students generated by hbm2java
 */
public class Students  implements java.io.Serializable {


     private String sid;
     private String sname;
     private String spwd;
     private String sgender;
     private String smobile;
     private String smajor;
     private int fans;
     private Set commentsForPid = new HashSet(0);
     private Set informations = new HashSet(0);
     private Set commentsForSid = new HashSet(0);

    public Students() {
    }

	
    public Students(String sid, String sname, String spwd,String sgender, String smajor, int fans) {
        this.sid = sid;
        this.sname = sname;
        this.spwd = spwd;
        this.sgender = sgender;
        this.smajor = smajor;
        this.fans = fans;
    }
    public Students(String sid, String sname, String spwd, String sgender, String smobile, String smajor, int fans, Set commentsForPid, Set informations, Set commentsForSid) {
       this.sid = sid;
       this.sname = sname;
       this.spwd = spwd;
       this.sgender = sgender;
       this.smobile = smobile;
       this.smajor = smajor;
       this.fans = fans;
       this.commentsForPid = commentsForPid;
       this.informations = informations;
       this.commentsForSid = commentsForSid;
    }
   
    public String getSid() {
        return this.sid;
    }
    
    public void setSid(String sid) {
        this.sid = sid;
    }
    public Serializable getSname() {
        return this.sname;
    }
    
    public void setSname(String sname) {
        this.sname = sname;
    }
    public String getSpwd() {
        return this.spwd;
    }
    
    public void setSpwd(String spwd) {
        this.spwd = spwd;
    }
    public String getSgender() {
        return this.sgender;
    }
    
    public void setSgender(String sgender) {
        this.sgender = sgender;
    }
    public String getSmobile() {
        return this.smobile;
    }
    
    public void setSmobile(String smobile) {
        this.smobile = smobile;
    }
    public String getSmajor() {
        return this.smajor;
    }
    
    public void setSmajor(String smajor) {
        this.smajor = smajor;
    }
    public int getFans() {
        return this.fans;
    }
    
    public void setFans(int fans) {
        this.fans = fans;
    }
    public Set getCommentsForPid() {
        return this.commentsForPid;
    }
    
    public void setCommentsForPid(Set commentsForPid) {
        this.commentsForPid = commentsForPid;
    }
    public Set getInformations() {
        return this.informations;
    }
    
    public void setInformations(Set informations) {
        this.informations = informations;
    }
    public Set getCommentsForSid() {
        return this.commentsForSid;
    }
    
    public void setCommentsForSid(Set commentsForSid) {
        this.commentsForSid = commentsForSid;
    }




}

