package engines.sceletal;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * The flags of the visit Object made easier to manipulate with this class!!!
 */
public class VisitFlags implements Serializable {
		public static long SHOW_ID = 0;
		public static int LOG_SELECT = 1;
		public static int LOG_INSERT = 2;
		public static int FILL_COMMITED_TR_QUEUE = 3;
		public static int FILL_ROLLBACK_TR_QUEUE = 4;
		public static int LOG_UPDATE = 5;
		public static int LOG_DELETE = 6;
		public static int USER_OWN_LOG_FILE = 7;
		public static int DEEP_VIEW = 8;
		public static int EMPTY_LOG_FACTORY = 9;
		public static int ALLOW_CHAT = 10;
		public static int KILL_SESSION = 11;
		public static int USE_REDIRECT_POLICY = 12;    //use redirect request to app pages to other sources based on redirect policy
		public static int EDIT_KEYS = 13;              //edit encryption keys
		public static int ENCRYPT_MESSAGE = 14;        //whether or not to encrypt chat messages
		public static int SET_SESSION_TIME_OUT = 15;   //set session time out
		public static int CLEAR_TR_QUEUE = 16;         //clears the user transaction queue if true
		
		private static final long serialVersionUID = -4676719772080994748L;
		long flags = 0;
		
		public VisitFlags(long flags){
			this.flags = flags;
		}
		
		public long getFlags() {
			return flags;
		}
		public void setFlags(long flags) {
			this.flags = flags;
		}

		//flag fields
		public boolean isShowId() {
			return !((flags & VISIT_FLAGS.SHOW_ID.val) == 0);
		}
		public void setShowId(boolean showId) {
			setFlag(VISIT_FLAGS.SHOW_ID, showId);
		}
		
		public boolean isClearTrQueue() {
			return !((flags & VISIT_FLAGS.CLEAR_TR_QUEUE.val) == 0);
		}
		public void setClearTrQueue(boolean b) {
			setFlag(VISIT_FLAGS.CLEAR_TR_QUEUE, b);
		}
		
		public boolean isSetSessionTimeOut() {
			return !((flags & VISIT_FLAGS.SET_SESSION_TIME_OUT.val) == 0);
		}
		public void setSetSessionTimeOut(boolean showId) {
			setFlag(VISIT_FLAGS.SET_SESSION_TIME_OUT, showId);
		}
		
		public boolean isEmptyLog() {
			return !((flags & VISIT_FLAGS.EMPTY_LOG_FACTORY.val) == 0);
		}
		public void setEmptyLog(boolean elog) {
			setFlag(VISIT_FLAGS.EMPTY_LOG_FACTORY, elog);
		}
		
		public boolean isLogUpdate() {
			return !((flags & VISIT_FLAGS.LOG_UPDATE.val) == 0);
		}
		public void setLogUpdate(boolean logUpdate) {
			setFlag(VISIT_FLAGS.LOG_UPDATE, logUpdate);
		}
		public boolean isLogDelete() {
			return !((flags & VISIT_FLAGS.LOG_DELETE.val) == 0);
		}
		public void setLogDelete(boolean logDelete) {
			setFlag(VISIT_FLAGS.LOG_DELETE, logDelete);
		}
		public boolean isLogInsert() {
			return !((flags & VISIT_FLAGS.LOG_INSERT.val) == 0);
		}
		public void setLogInsert(boolean logInsert) {
			setFlag(VISIT_FLAGS.LOG_INSERT, logInsert);
		}
		public boolean isLogSelect() {
			return !((flags & VISIT_FLAGS.LOG_SELECT.val) == 0);
		}
		public void setLogSelect(boolean logSelect) {
			setFlag(VISIT_FLAGS.LOG_SELECT, logSelect);
		}
		public boolean isUserOwnLogFile() {
			return !((flags & VISIT_FLAGS.USER_OWN_LOG_FILE.val) == 0);
		}
		public void setUserOwnLogFile(boolean userOwnLogFile) {
			setFlag(VISIT_FLAGS.USER_OWN_LOG_FILE, userOwnLogFile);
		}
		public boolean isFillTransactionQueue() {
			// TODO Auto-generated method stub
			return !((flags & VISIT_FLAGS.FILL_COMMITED_TR_QUEUE.val) == 0);
		}
		
		public void setFillTransactionQueue(boolean set) {
			// TODO Auto-generated method stub
			setFlag(VISIT_FLAGS.FILL_COMMITED_TR_QUEUE, set);
		}
		
		public boolean isDeepView(){
			return !((flags & VISIT_FLAGS.DEEP_VIEW.val) == 0);
		}
		
		public void setDeepView(boolean set){
			setFlag(VISIT_FLAGS.DEEP_VIEW, set);
		}
		public boolean isFillRollbackedTransactionQueue() {
			// TODO Auto-generated method stub
			return !((flags & VISIT_FLAGS.FILL_ROLLBACK_TR_QUEUE.val) == 0);
		}
		
		public void setFillRollbackedTransactionQueue(boolean set) {
			// TODO Auto-generated method stub
			setFlag(VISIT_FLAGS.FILL_ROLLBACK_TR_QUEUE, set);
		}
		
		public boolean isAllowChat(){
			return !((flags & VISIT_FLAGS.ALLOW_CHAT.val) == 0);
		}
		
		public void setAllowChat(boolean set){
			setFlag(VISIT_FLAGS.ALLOW_CHAT, set);
		}
		public boolean isKillSession(){
			return !((flags & VISIT_FLAGS.KILL_SESSION.val) == 0);
		}
		
		public void setKillSesssion(boolean set){
			setFlag(VISIT_FLAGS.KILL_SESSION, set);
		}
		
		public void setUseRedirectPolicy(boolean set){
			setFlag(VISIT_FLAGS.USE_REDIRECT_POLICY, set);
		}
		public boolean isUseRedirectPolicy(){
			return !((flags & VISIT_FLAGS.USE_REDIRECT_POLICY.val) == 0);
		}
		
		public void setEditKeys(boolean set){
			setFlag(VISIT_FLAGS.EDIT_KEYS, set);
		}
		public boolean isEditKeys(){
			return !((flags & VISIT_FLAGS.EDIT_KEYS.val) == 0);
		}
		public boolean isEncryptMessage(){
			return !((flags & VISIT_FLAGS.ENCRYPT_MESSAGE.val) == 0);
		}
		
		public void setEncryptMessage(boolean set){
			setFlag(VISIT_FLAGS.ENCRYPT_MESSAGE, set);
		}
		
		//end of flag fields
		
		
		/**
		 * Sets the corresponding flag to zero or one based on the boolean input parameter!
		 * @param flag
		 * @param set
		 */
		private void setFlag(VISIT_FLAGS flag, boolean set){
			if(set) flags = ( flags | flag.val);
			else  flags = (flags & (~flag.val));
		}
		
		private boolean testFlag(VISIT_FLAGS flag){
			return ((flag.val & flags)!=0);
		}
		
		public boolean testFlag(int flagNumber){
			return ((flags & (1 << flagNumber))!=0);
		}
		
		/**
		 * Enumeration with visit flags!
		 * @author lubo
		 *
		 */
		private enum VISIT_FLAGS{
			SHOW_ID(1 << VisitFlags.SHOW_ID),
			LOG_SELECT(1 << VisitFlags.LOG_SELECT),
			LOG_INSERT(1 << VisitFlags.LOG_INSERT),
			FILL_COMMITED_TR_QUEUE(1 << VisitFlags.FILL_COMMITED_TR_QUEUE),
			FILL_ROLLBACK_TR_QUEUE(1 << VisitFlags.FILL_ROLLBACK_TR_QUEUE),
			LOG_UPDATE(1 << VisitFlags.LOG_UPDATE),
			LOG_DELETE(1 << VisitFlags.LOG_DELETE),
			USER_OWN_LOG_FILE(1 << VisitFlags.USER_OWN_LOG_FILE),
			DEEP_VIEW(1 << VisitFlags.DEEP_VIEW),
			EMPTY_LOG_FACTORY(1 << VisitFlags.EMPTY_LOG_FACTORY),
			ALLOW_CHAT(1 << VisitFlags.ALLOW_CHAT),
			KILL_SESSION(1 << VisitFlags.KILL_SESSION),
			USE_REDIRECT_POLICY(1 << VisitFlags.USE_REDIRECT_POLICY),
			EDIT_KEYS(1 << VisitFlags.EDIT_KEYS),
			ENCRYPT_MESSAGE(1 << VisitFlags.ENCRYPT_MESSAGE),
			SET_SESSION_TIME_OUT(1 << VisitFlags.SET_SESSION_TIME_OUT),
			CLEAR_TR_QUEUE(1 << VisitFlags.CLEAR_TR_QUEUE);
			
			VISIT_FLAGS(long val){
				this.val = val;
			}
			
			private long val;
		}

		
		public String getFlagsString(){
			//if(!AppUtil.getVisit().getVisitAdditionals().isDeepView()) return String.valueOf(flags); 
			List<String> cells0 = new ArrayList<String>();
			List<String> cells = new ArrayList<String>();
			String tdPrefix = "<td style=\"border:solid 1px;\">";
			String zero=tdPrefix + "0</td>";
			String one= "<td style=\"border:solid 1px; color:green; font-weight:bold;\">"+"X</td>";
			
			cells0.add(tdPrefix+"16</td>");
			cells0.add(tdPrefix+"15</td>");
			cells0.add(tdPrefix+"14</td>");
			cells0.add(tdPrefix+"13</td>");
			cells0.add(tdPrefix+"12</td>");
			cells0.add(tdPrefix+"11</td>");
			cells0.add(tdPrefix+"10</td>");
			cells0.add(tdPrefix+"9</td>");
			cells0.add(tdPrefix+"8</td>");
			cells0.add(tdPrefix+"7</td>");
			cells0.add(tdPrefix+"6</td>");
			cells0.add(tdPrefix+"5</td>");
			cells0.add(tdPrefix+"4</td>");
			cells0.add(tdPrefix+"3</td>");
			cells0.add(tdPrefix+"2</td>");
			cells0.add(tdPrefix+"1</td>");
			cells0.add(tdPrefix+"0</td>");
			
			cells.add(tdPrefix+"CT</td>");
			cells.add(tdPrefix+"ST</td>");
			cells.add(tdPrefix+"EM</td>");
			cells.add(tdPrefix+"EK</td>");
			cells.add(tdPrefix+"RD</td>");
			cells.add(tdPrefix+"KS</td>");
			cells.add(tdPrefix+"AC</td>");
			cells.add(tdPrefix+"EL</td>");
			cells.add(tdPrefix+"DV</td>");
			cells.add(tdPrefix+"UL</td>");
			cells.add(tdPrefix+"LD</td>");
			cells.add(tdPrefix+"LU</td>");
			cells.add(tdPrefix+"FR</td>");
			cells.add(tdPrefix+"FC</td>");
			cells.add(tdPrefix+"LI</td>");
			cells.add(tdPrefix+"LS</td>");
			cells.add(tdPrefix+"SI</td>");
			
			String r0, r1, r2 = "<tr style=\"border:solid 1px;\">";
			r1 = r2; r0= r2;
			for(String c :cells0){r0+=c;}
			r0+="</tr>";
			
			for(String c :cells){r1+=c;}
			r1+="</tr>";
	
			if(testFlag(VISIT_FLAGS.CLEAR_TR_QUEUE)) r2+=one; else r2+=zero;
			if(testFlag(VISIT_FLAGS.SET_SESSION_TIME_OUT)) r2+=one; else r2+=zero;
			if(testFlag(VISIT_FLAGS.ENCRYPT_MESSAGE)) r2+=one; else r2+=zero;
			if(testFlag(VISIT_FLAGS.EDIT_KEYS)) r2+=one; else r2+=zero;
			if(testFlag(VISIT_FLAGS.USE_REDIRECT_POLICY)) r2+=one; else r2+=zero;
			if(testFlag(VISIT_FLAGS.KILL_SESSION)) r2+=one; else r2+=zero;
			if(testFlag(VISIT_FLAGS.ALLOW_CHAT)) r2+=one; else r2+=zero;
			if(testFlag(VISIT_FLAGS.EMPTY_LOG_FACTORY)) r2+=one; else r2+=zero;
			if(testFlag(VISIT_FLAGS.DEEP_VIEW)) r2+=one; else r2+=zero;
			if(testFlag(VISIT_FLAGS.USER_OWN_LOG_FILE)) r2+=one; else r2+=zero;
			if(testFlag(VISIT_FLAGS.LOG_DELETE)) r2+=one; else r2+=zero;
			if(testFlag(VISIT_FLAGS.LOG_UPDATE)) r2+=one; else r2+=zero;
			if(testFlag(VISIT_FLAGS.FILL_ROLLBACK_TR_QUEUE)) r2+=one; else r2+=zero;
			if(testFlag(VISIT_FLAGS.FILL_COMMITED_TR_QUEUE)) r2+=one; else r2+=zero;
			if(testFlag(VISIT_FLAGS.LOG_INSERT)) r2+=one; else r2+=zero;
			if(testFlag(VISIT_FLAGS.LOG_SELECT)) r2+=one; else r2+=zero;
			if(testFlag(VISIT_FLAGS.SHOW_ID)) r2+=one; else r2+=zero;
			r2+="</tr>";
			return "<table style=\"border:solid 1px;border-collapse: collapse;\">" + r0 + r1 + r2 + "</table>";
		}
		
		
}
