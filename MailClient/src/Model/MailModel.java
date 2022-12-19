/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author vothu
 */
public class MailModel {

    public MailModel() {
    }
    protected int id;
    protected String title;
    protected String content;
    protected Date dateCreated;
    protected String sender;
    protected String receiver;

    public MailModel(String title, String content, Date dateCreated, String sender, String receiver) {
        this.title = title;
        this.content = content;
        this.dateCreated = dateCreated;
        this.sender = sender;
        this.receiver = receiver;
    }

    public String getSummary() {
        return (id
                + " - \nTitle:"
                + title
                + " - \nMessage:"
                + content.substring(0, 10)
                + " - \nDate:"
                + dateCreated);
    }

    public String getAll() {
        return (title
                + " - "
                + content
                + " - "
                + dateCreated
                + " - "
                + sender
                + " - "
                + receiver);
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public void setId(int id) {
        this.id = id;
    }

}
