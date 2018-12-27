package engines.sceletal;

import java.io.Serializable;

/*
import net.is_bg.ltf.AppUtil;
import net.is_bg.ltf.SessionDataBean;
import net.is_bg.ltf.Visit;
import net.is_bg.ltf.db.common.DBTransactionQueue;
import net.is_bg.ltf.db.common.DBTransactionQueue.IMaxSizeProvider;
import net.is_bg.ltf.db.common.interfaces.IDBTransaction;
*/

/***
 * Additional data set to the Visit object in the data field!!!
 * @author lubo
 *
 */
class VisitData implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1448879756807537607L;
	//private VisitFlags vFlags = new VisitFlags(0);
	
	
	/*private IMaxSizeProvider pr = new IMaxSizeProvider() {
		@Override
		public int getMaxSixe() {
			// TODO Auto-generated method stub
			return 10000;
		}
		
	};*/
	/*private DBTransactionQueue<IDBTransaction>   transactionQueue = new DBTransactionQueue<IDBTransaction>(pr);
	private IMaxSizeProvider rollbackSizeProvider = new IMaxSizeProvider() {
		@Override
		public int getMaxSixe() {
			// TODO Auto-generated method stub
			return 100;
		}
	};*/
	//private DBTransactionQueue<IDBTransaction>  rollBackTransactionQueue = new DBTransactionQueue<IDBTransaction>(rollbackSizeProvider);
	
	/*public void addChatRoom(String chatRoomId){
		visitChatRoomIds.add(chatRoomId);
	}
	
	public Set<String> getVisitChatRoomIds() {
		return visitChatRoomIds;
	}
	
	public DBTransactionQueue<IDBTransaction> getTransactionQueue() {
		return transactionQueue;
	}
	public DBTransactionQueue<IDBTransaction> getRollBackTransactionQueue() {
		return rollBackTransactionQueue;
	}
	
	public static VisitData getVisitDataForVisitSafe(Visit visit){
		Object vdata = visit.getVisitAdditionals().getData();
		if(vdata == null){vdata = new VisitData();  visit.getVisitAdditionals().setData(vdata);}
		return (VisitData)vdata;
	}
	
	public static VisitData getVisitDataForCurrentVisitSafe(){
		Visit visit = SessionDataBean.getSessionDataBeanFromSession().getVisit();
		return getVisitDataForVisitSafe(visit);
	}
	
	public String getFlagsString(){
		vFlags.setFlags(AppUtil.getVisit() == null ? 0 : AppUtil.getVisit().getVisitAdditionals().getFlags());
		return vFlags.getFlagsString();
	}
	*/
}
