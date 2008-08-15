package com.dfcw.zjproject.zj.model;

import java.io.Serializable;

import java.util.HashSet;
import java.util.Set;


import org.apache.struts.action.ActionForm;

import com.zhjedu.exam.domain.ZjCourse;

public class AssignmentModel extends ActionForm implements Serializable {

	private String id;

	private String paper;

	private String course;

	private String name;

	private String description;

	private Long timeopen;

	private Long timeclose;

	private Long timelimit;

	private Long questionsperpage;

	private String randomquestions;

	private Long maxExamNum;

	private String attemptonlast;

	private String grademethod;

	private String scope;

	private Long totalPoint;

	private Long decimalpoints;

	private String password;

	private Double passscore;

	private String isScore;

	private String quizType;

	private String quizStyle;

	private String distinguish;

	private String status;

	private String showAnswer;

	private String showScore;

	private String isInvigilate;

	private String paperLocation;

	private Long createdate;

	private Long lasteditdate;

	private String creator;

	private String lasteditor;

	private String delflag;

	private String reador;

	private String invigilator2;

	private String invigilator1;

	private String invigilator3;

	private Set zjQuizExams = new HashSet(0);

	private ZjCourse zjCourse;

	// Constructors

	/** default constructor */
	public AssignmentModel() {
	}

	/** minimal constructor */
	public AssignmentModel(String name, Long timeopen, Long timeclose, Long timelimit,
			Long questionsperpage, String randomquestions, Long maxExamNum,
			String attemptonlast, String grademethod, Double passscore,
			Long createdate, Long lasteditdate, String delflag,
			Set zjQuizExams, ZjCourse zjCourse) {
		this.name = name;
		this.timeopen = timeopen;
		this.timeclose = timeclose;
		this.timelimit = timelimit;
		this.questionsperpage = questionsperpage;
		this.randomquestions = randomquestions;
		this.maxExamNum = maxExamNum;
		this.attemptonlast = attemptonlast;
		this.grademethod = grademethod;
		this.passscore = passscore;
		this.createdate = createdate;
		this.lasteditdate = lasteditdate;
		this.delflag = delflag;
		this.zjQuizExams = zjQuizExams;
		this.zjCourse = zjCourse;
	}

	/** full constructor */
	public AssignmentModel(String paper, String course, String name, String description,
			Long timeopen, Long timeclose, Long timelimit,
			Long questionsperpage, String randomquestions, Long maxExamNum,
			String attemptonlast, String grademethod, String scope,
			Long totalPoint, Long decimalpoints, String password,
			Double passscore, String isScore, String quizType,
			String quizStyle, String distinguish, String status,
			String showAnswer, String showScore, String isInvigilate,
			String paperLocation, Long createdate, Long lasteditdate,
			String creator, String lasteditor, String delflag, String reador,
			String invigilator2, String invigilator1, String invigilator3,
			Set zjQuizExams, ZjCourse zjCourse) {
		this.paper = paper;
		this.course = course;
		this.name = name;
		this.description = description;
		this.timeopen = timeopen;
		this.timeclose = timeclose;
		this.timelimit = timelimit;
		this.questionsperpage = questionsperpage;
		this.randomquestions = randomquestions;
		this.maxExamNum = maxExamNum;
		this.attemptonlast = attemptonlast;
		this.grademethod = grademethod;
		this.scope = scope;
		this.totalPoint = totalPoint;
		this.decimalpoints = decimalpoints;
		this.password = password;
		this.passscore = passscore;
		this.isScore = isScore;
		this.quizType = quizType;
		this.quizStyle = quizStyle;
		this.distinguish = distinguish;
		this.status = status;
		this.showAnswer = showAnswer;
		this.showScore = showScore;
		this.isInvigilate = isInvigilate;
		this.paperLocation = paperLocation;
		this.createdate = createdate;
		this.lasteditdate = lasteditdate;
		this.creator = creator;
		this.lasteditor = lasteditor;
		this.delflag = delflag;
		this.reador = reador;
		this.invigilator2 = invigilator2;
		this.invigilator1 = invigilator1;
		this.invigilator3 = invigilator3;
		this.zjQuizExams = zjQuizExams;
		this.zjCourse = zjCourse;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPaper() {
		return this.paper;
	}

	public void setPaper(String paper) {
		this.paper = paper;
	}

	public String getCourse() {
		return this.course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getTimeopen() {
		return this.timeopen;
	}

	public void setTimeopen(Long timeopen) {
		this.timeopen = timeopen;
	}

	public Long getTimeclose() {
		return this.timeclose;
	}

	public void setTimeclose(Long timeclose) {
		this.timeclose = timeclose;
	}

	public Long getTimelimit() {
		return this.timelimit;
	}

	public void setTimelimit(Long timelimit) {
		this.timelimit = timelimit;
	}

	public Long getQuestionsperpage() {
		return this.questionsperpage;
	}

	public void setQuestionsperpage(Long questionsperpage) {
		this.questionsperpage = questionsperpage;
	}

	public String getRandomquestions() {
		return this.randomquestions;
	}

	public void setRandomquestions(String randomquestions) {
		this.randomquestions = randomquestions;
	}

	public Long getMaxExamNum() {
		return this.maxExamNum;
	}

	public void setMaxExamNum(Long maxExamNum) {
		this.maxExamNum = maxExamNum;
	}

	public String getAttemptonlast() {
		return this.attemptonlast;
	}

	public void setAttemptonlast(String attemptonlast) {
		this.attemptonlast = attemptonlast;
	}

	public String getGrademethod() {
		return this.grademethod;
	}

	public void setGrademethod(String grademethod) {
		this.grademethod = grademethod;
	}

	public String getScope() {
		return this.scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public Long getTotalPoint() {
		return this.totalPoint;
	}

	public void setTotalPoint(Long totalPoint) {
		this.totalPoint = totalPoint;
	}

	public Long getDecimalpoints() {
		return this.decimalpoints;
	}

	public void setDecimalpoints(Long decimalpoints) {
		this.decimalpoints = decimalpoints;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Double getPassscore() {
		return this.passscore;
	}

	public void setPassscore(Double passscore) {
		this.passscore = passscore;
	}

	public String getIsScore() {
		return this.isScore;
	}

	public void setIsScore(String isScore) {
		this.isScore = isScore;
	}

	public String getQuizType() {
		return this.quizType;
	}

	public void setQuizType(String quizType) {
		this.quizType = quizType;
	}

	public String getQuizStyle() {
		return this.quizStyle;
	}

	public void setQuizStyle(String quizStyle) {
		this.quizStyle = quizStyle;
	}

	public String getDistinguish() {
		return this.distinguish;
	}

	public void setDistinguish(String distinguish) {
		this.distinguish = distinguish;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getShowAnswer() {
		return this.showAnswer;
	}

	public void setShowAnswer(String showAnswer) {
		this.showAnswer = showAnswer;
	}

	public String getShowScore() {
		return this.showScore;
	}

	public void setShowScore(String showScore) {
		this.showScore = showScore;
	}

	public String getIsInvigilate() {
		return this.isInvigilate;
	}

	public void setIsInvigilate(String isInvigilate) {
		this.isInvigilate = isInvigilate;
	}

	public String getPaperLocation() {
		return this.paperLocation;
	}

	public void setPaperLocation(String paperLocation) {
		this.paperLocation = paperLocation;
	}

	public Long getCreatedate() {
		return this.createdate;
	}

	public void setCreatedate(Long createdate) {
		this.createdate = createdate;
	}

	public Long getLasteditdate() {
		return this.lasteditdate;
	}

	public void setLasteditdate(Long lasteditdate) {
		this.lasteditdate = lasteditdate;
	}

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getLasteditor() {
		return this.lasteditor;
	}

	public void setLasteditor(String lasteditor) {
		this.lasteditor = lasteditor;
	}

	public String getDelflag() {
		return this.delflag;
	}

	public void setDelflag(String delflag) {
		this.delflag = delflag;
	}

	public String getReador() {
		return this.reador;
	}

	public void setReador(String reador) {
		this.reador = reador;
	}

	public String getInvigilator2() {
		return this.invigilator2;
	}

	public void setInvigilator2(String invigilator2) {
		this.invigilator2 = invigilator2;
	}

	public String getInvigilator1() {
		return this.invigilator1;
	}

	public void setInvigilator1(String invigilator1) {
		this.invigilator1 = invigilator1;
	}

	public String getInvigilator3() {
		return this.invigilator3;
	}

	public void setInvigilator3(String invigilator3) {
		this.invigilator3 = invigilator3;
	}

	public ZjCourse getZjCourse() {
		return zjCourse;
	}

	public void setZjCourse(ZjCourse zjCourse) {
		this.zjCourse = zjCourse;
	}

	public Set getZjQuizExams() {
		return zjQuizExams;
	}

	public void setZjQuizExams(Set zjQuizExams) {
		this.zjQuizExams = zjQuizExams;
	}

}

