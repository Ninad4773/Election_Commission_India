package com.eci.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "voterdocument")
public class VoterDocument {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "docid")
	private int docId;
	private String uid;
	private String pan;
	private String photo;
	@OneToOne
	@JoinColumn(name = "voterid")
	private VoterInfo voterInfo;

	public VoterDocument() {
	}

	public VoterDocument(int docId, String uid, String pan, String photo) {
		this.docId = docId;
		this.uid = uid;
		this.pan = pan;
		this.photo = photo;
	}

	public int getDocId() {
		return docId;
	}

	public void setDocId(int docId) {
		this.docId = docId;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public VoterInfo getVoterInfo() {
		return voterInfo;
	}

	public void setVoterInfo(VoterInfo voterInfo) {
		this.voterInfo = voterInfo;
	}

	@Override
	public String toString() {
		return "VoterDocument [docId=" + docId + ", uid=" + uid + ", pan=" + pan + ", photo=" + photo + ", voterInfo="
				+ voterInfo + "]";
	}

}
