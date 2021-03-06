package org.gitmining.monitor.util;

public class URLMapping {
	/**
	 * show project commit page
	 */
	public static final String PROJECT_COMMIT = "/project/commit";
	/**
	 * get project commit data 
	 */
	public static final String PROJECT_COMMIT_RANGE = "/project/commit/range";
	/**
	 * show all projects commit info
	 */
	public static final String PROJECT_SUMMARY = "/project/summary";
	/**
	 * get all projects commit data
	 */
	public static final String PROJECT_SUMMARY_DATA = "/project/summary/data";
	
	/**
	 * show project event page
	 */
	@Deprecated
	public static final String PROJECT_EVENT = "/project/event";
	/**
	 * get project event data
	 */
	@Deprecated
	public static final String PROJECT_EVENT_RANGE = "/project/event/range";
	/**
	 * show project team member page
	 */
	public static final String PROJECT_TEAM = "/project/team";
	/**
	 * get project team team data
	 */
	public static final String PROJECT_TEAMMEMBER = "/project/teammember";
	/**
	 * show project score
	 */
	public static final String PROJECT_SCORE = "/project/score";
	/**
	 * add a column of project score item
	 */
	public static final String PROJECT_SCORE_ADD = "/project/score/add";
	/**
	 * change score for a specific project in one item 
	 */
	public static final String PROJECT_SCORE_CHANGE = "/project/score/change";
	/**
	 * disable an item
	 */
	public static final String PROJECT_SCORE_DELETE = "/project/score/delete";
	/**
	 * statistics
	 */
	public static final String PROJECT_SCORE_STATISTICS = "/project/score/statistics";
	/**
	 * search team
	 */
	public static final String PROJECT_TEAM_SEARCH = "/project/team/search";
	/**
	 * show student commit page
	 */
	public static final String STUDENT_COMMIT = "/student/commit";
	/**
	 * get student commit data
	 */
	public static final String STUDENT_COMMIT_RANGE = "/student/commit/range";
	/**
	 * show all student commits info
	 */
	public static final String STUDENT_SUMMARY = "/student/summary";
	/**
	 * get all student commits data
	 */
	public static final String STUDENT_SUMMARY_DATA = "/student/summary/data";
	/**
	 * check whether username or email exists
	 */
	public static final String CHECK_RRGISTER_ITEM = "/register/check";
	
	/**
	 * show course manage homepage
	 */
	public static final String COURSE_HOMEPAGE = "/course/manage";
	
	public static final String COURSE_ADD = "/course/add";
	
	public static final String LOGIN_FORGET = "/login/forget";
	public static final String LOGIN_FORGET_EMAIL = "/login/forget/email";
	public static final String LOGIN_RESET = "/login/reset";
	public static final String LOGIN_PASSWORD_RESET = "/login/password/reset";
}
