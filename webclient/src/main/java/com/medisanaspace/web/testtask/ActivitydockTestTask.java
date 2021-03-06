package com.medisanaspace.web.testtask;

import java.util.ArrayList;
import java.util.List;

import com.medisanaspace.model.Activitydock;
import com.medisanaspace.model.fixture.ActivitydockFixture;
import com.medisanaspace.web.library.AuthorizationBuilder;

/**
 */
public class ActivitydockTestTask extends AbstractTestTask {

	public ActivitydockTestTask(int numberOfEntries) {
		super(numberOfEntries);
	}

	/**
	 * Method executeTask.
	 * 
	 * @throws Exception
	 */
	@Override
	protected void executeTask() throws Exception {
		
		final List<Activitydock> activityList = new ArrayList<Activitydock>();

		for (int i = 0; i < numberOfEntries; i++) {
			activityList.add(new ActivitydockFixture().getActivity());
		}
		
		printer.startDataSet("Activitydock Test.");
		StandardCRUDTestTask crudtest = new StandardCRUDTestTask(
				numberOfEntries, AuthorizationBuilder.ACTIVITY_MODULE_ID,
				Activitydock.toJsonArray(activityList));

		crudtest.setPrinter(printer);
		crudtest.setServerConfig(this.getServerConfig());
		crudtest.setOauthData(this.getOauthData());
		crudtest.executeTask();
		
//		printer.logActivity("Counting data before the test.");	
//		int preTestcount = countData(oauthData.getDeviceToken(),
//				oauthData.getDeviceSecret(),
//				AuthorizationBuilder.ACTIVITY_MODULE_ID,
//				oauthData.getAccessToken(), oauthData.getAccessSecret());
//		printer.logMessage("There are now "+preTestcount+" datasets on the server.");
//		
//		printer.logActivity("Saving the JSON data on the server.");
//		
//		String response= saveJSONData(oauthData.getDeviceToken(),
//				oauthData.getDeviceSecret(),
//				Activitydock.toJsonArray(activityList),
//				AuthorizationBuilder.ACTIVITY_MODULE_ID,
//				oauthData.getAccessToken(), oauthData.getAccessSecret());
//		
//		Collection<Activitydock> idList = Activitydock
//				.fromJsonArrayToActivitys(response);
//		
//		int countActivity = countData(oauthData.getDeviceToken(),
//				oauthData.getDeviceSecret(),
//				AuthorizationBuilder.ACTIVITY_MODULE_ID,
//				oauthData.getAccessToken(), oauthData.getAccessSecret());
		
//		if (countActivity-preTestcountActivity!=numberOfEntries){
//			printer.logError("The data count after writing to the server is wrong: "+countActivity);
//			throw new Exception("Wrong data count!");
//		}
//		this.printer.logMessage("Data count " + countActivity);
//		
//		printer.logActivity("Retrieving a list of all activities from the server.");
//		responseActivity = syncData(oauthData.getDeviceToken(),
//				oauthData.getDeviceSecret(),
//				AuthorizationBuilder.ACTIVITY_MODULE_ID,
//				oauthData.getAccessToken(), oauthData.getAccessSecret());
//
//		Collection<Activitydock> responseActivityList = Activitydock
//				.fromJsonArrayToActivitys(responseActivity);
//
//		ArrayList<String> idList = new ArrayList<String>();
//		idList.add(activityList.get(activityList.size()-1).getId());
//		printer.logActivity("Deleting the activity data on the server.");
//		this.deleteJSONData(oauthData.getDeviceToken(),
//				oauthData.getDeviceSecret(),
//				AuthorizationBuilder.ACTIVITY_MODULE_ID,
//				oauthData.getAccessToken(), oauthData.getAccessSecret(),
//				idList);
//
//		// count data again
//		int postCountActivity = countData(oauthData.getDeviceToken(),
//				oauthData.getDeviceSecret(),
//				AuthorizationBuilder.ACTIVITY_MODULE_ID,
//				oauthData.getAccessToken(), oauthData.getAccessSecret());
//		
//		if (preTestcountActivity != postCountActivity){
//			printer.logError("The data count after deleting the test data from the server is wrong: "+postCountActivity);
//			throw new Exception("Deletion of activity not successful!");
//		}
		
		
	}

}
