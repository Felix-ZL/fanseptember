package com.fanseptember.model;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.fanseptember.define.AttitudeType;
import lombok.Data;

@Data
@Entity
public class Attitude {
	private @Id @GeneratedValue Long id;
	private Long article_id;
	private Long comment_id;
	private Long reporter_id;	
	private Date commit_time;
	private AttitudeType attitude;
}
