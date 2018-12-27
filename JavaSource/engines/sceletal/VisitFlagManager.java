package engines.sceletal;


public abstract class VisitFlagManager {

	private VisitFlags flags;
	public VisitFlagManager() {
		this(0);
	}
	
	public VisitFlagManager(long flags){
		this.flags = new VisitFlags(flags);
	}
	public boolean isSetSessionTimeOut() {
		return flags.isSetSessionTimeOut();
	}
	public void setSetSessionTimeOut(boolean showId) {
		flags.setSetSessionTimeOut(showId);
		setTovisit();
	}
	public boolean isShowId() {
		return flags.isShowId();
	}
	public void setShowId(boolean showId) {
		flags.setShowId(showId);
		setTovisit();
	}
	public boolean isEmptyLog() {
		return flags.isEmptyLog();
	}
	public void setEmptyLog(boolean elog) {
		flags.setEmptyLog(elog);
		setTovisit();
	}
	public boolean isLogUpdate() {
		return flags.isLogUpdate();
	}
	public void setLogUpdate(boolean logUpdate) {
		flags.setLogUpdate(logUpdate);
		setTovisit();
	}
	public boolean isLogDelete() {
		return flags.isLogDelete();
		
	}
	public void setLogDelete(boolean logDelete) {
		flags.setLogDelete(logDelete);
		setTovisit();
	}
	public boolean isLogInsert() {
		return flags.isLogDelete();
	}
	public void setLogInsert(boolean logInsert) {
		flags.setLogInsert(logInsert);
		setTovisit();
	}
	public boolean isLogSelect() {
		return flags.isLogSelect();
	}
	public void setLogSelect(boolean logSelect) {
		flags.setLogSelect(logSelect);
		setTovisit();
	}
	public boolean isUserOwnLogFile() {
		return flags.isUserOwnLogFile();
	}
	public void setUserOwnLogFile(boolean userOwnLogFile) {
		flags.setUserOwnLogFile(userOwnLogFile);
		setTovisit();
	}
	public boolean isFillTransactionQueue() {
		// TODO Auto-generated method stub
		return flags.isFillTransactionQueue();
	}
	public void setFillTransactionQueue(boolean set) {
		// TODO Auto-generated method stub
		flags.setFillTransactionQueue(set);
		setTovisit();
	}
	public boolean isDeepView(){
		return flags.isDeepView();
	}
	public void setDeepView(boolean set){
		flags.setDeepView(set);
		setTovisit();
	}
	
	public boolean isClearTrQueue(){
		return flags.isClearTrQueue();
	}
	public void setClearTrQueue(boolean set){
		flags.setClearTrQueue(set);
		setTovisit();
	}
	
	public void setEditKeys(boolean set){
		flags.setEditKeys(set);
		setTovisit();
	}
	public boolean isEditKeys(){
		return flags.isEditKeys();
	}
	
	
	public boolean isUseRedirectPolicy(){
		return flags.isUseRedirectPolicy();
	}
	public void setUseRedirectPolicy(boolean set){
		flags.setUseRedirectPolicy(set);
		setTovisit();
	}
	
	public boolean isFillRollbackedTransactionQueue() {
		// TODO Auto-generated method stub
		return flags.isFillRollbackedTransactionQueue();
	}
	public void setFillRollbackedTransactionQueue(boolean set) {
		// TODO Auto-generated method stub
		flags.setFillRollbackedTransactionQueue(set);
		setTovisit();
	}
	
	public boolean isAllowChat(){
		return flags.isAllowChat();
	}
	
	public void setAllowChat(boolean set){
		flags.setAllowChat(set);
		setTovisit();
	}
	
	public void setKillSession(boolean set){
		flags.setKillSesssion(set);
		setTovisit();
	}
	
	public boolean isKillSession(){
		return flags.isKillSession();
	}
	
	public boolean isEncryptMessage(){
		return flags.isEncryptMessage();
	}
	
	public void setEncryptMessage(boolean set){
		flags.setEncryptMessage(set);
		setTovisit();
	}
	
	protected abstract void setTovisit();
	
}
