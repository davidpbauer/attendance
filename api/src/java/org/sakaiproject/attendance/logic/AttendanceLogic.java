/*
 *  Copyright (c) 2015, The Apereo Foundation
 *
 *  Licensed under the Educational Community License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *              http://opensource.org/licenses/ecl2
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.sakaiproject.attendance.logic;

import java.util.List;

//import com.google.ical.values.RRule;
//import de.scravy.pair.Pair;
import org.sakaiproject.attendance.model.AttendanceSite;
import org.sakaiproject.attendance.model.Event;
import org.sakaiproject.attendance.model.Reoccurrence;

/**
 * An example logic interface
 * 
 * @author Leonardo Canessa [lcanessa1 (at) udayton (dot) edu]
 *
 */
public interface AttendanceLogic {

	/**
	 * Gets the Attendance site by Sakai Site ID
	 * @param siteID, sakai Site ID
	 * @return the Attendance Site
     */
	AttendanceSite getAttendanceSite(String siteID);

	/**
	 *
	 * @return The Current Attendance Site
     */
	AttendanceSite getCurrentAttendanceSite();

	/**
	 * Get a Event
	 * @return
	 */
	Event getEvent(long id);
	
	/**
	 * Get all events (should probably never be used)
	 * @return
	 */
	List<Event> getEvents();

	/**
	 * Gets all the evetns by Sakai Site ID
	 * @param siteID, the sakai siteID for a site
	 * @return a list of events, or empty
     */
	List<Event> getEventsForSite(String siteID);

	/**
	 * gets all the events by (internal) Site id
	 * @param id
	 * @return List of events, or empty
     */
	List<Event> getEventsForSite(AttendanceSite id);

	/**
	 * Get events for curenet site
	 * @return list of events
     */
	List<Event> getEventsForCurrentSite();
	
	/**
	 * Add a new Event
	 * @param e	Event
	 * @return true if success, false if not
	 */
	boolean addEvent(Event e);

/*	/**
	 * Add a reoccurring Event
	 * @param t, the event model
	 * @param r, the RFC-2445 RRule
	 * @return true if success
	 *//*
	boolean addEvents(Event t, RRule r);

	/**
	 * Add a new Reoccurrence
	 * @param r, the Rrule for the object
	 * @return
	 *//*
	Pair<Boolean, Long> addReoccurrence(RRule r);*/

	/**
	 * Add Reoccurrence
	 * @param r, the Reocurrence
	 * @return true if success, false otherwise
	 */
	boolean addReoccurrence(Reoccurrence r);
}