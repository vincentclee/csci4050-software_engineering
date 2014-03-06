package test;

/**
 * @author Vincent Lee
 * @version 1.0
 * @since 2013-11-13
 */

import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.Map;
import modules.registration_mod;
import org.junit.Test;

public class registration_test {

	@Test
	public void Robert_Herjavec() {
		registration_mod instance = new registration_mod();
		Map<String, String[]> parameterMap = new HashMap<String, String[]>();
		
		parameterMap.put("username", new String[]{"robertherjavec"});
		parameterMap.put("password", new String[]{"TheHerjavecGroup", "TheHerjavecGroup"});
		parameterMap.put("email", new String[]{"herjavec@herjavecgroup.com"});
		assertTrue("step", instance.step(parameterMap).isEmpty());
		parameterMap.clear();
		
		parameterMap.put("name", new String[]{"home"});
		parameterMap.put("street1", new String[]{"One Rockefeller Plaza"});
		parameterMap.put("street2", new String[]{"11th Floor"});
		parameterMap.put("city", new String[]{"New York"});
		parameterMap.put("state", new String[]{"NY"});
		parameterMap.put("zip", new String[]{"10020"});
		assertTrue("step1", instance.step1(parameterMap).isEmpty());
		parameterMap.clear();
		
		parameterMap.put("1", new String[]{"Select"});
		assertTrue("step2", instance.step2(parameterMap).isEmpty());
		parameterMap.clear();
		
		parameterMap.put("firstname", new String[]{"Robert"});
		parameterMap.put("middlename", new String[]{""});
		parameterMap.put("lastname", new String[]{"Herjavec"});
		parameterMap.put("phonenumber", new String[]{"1-866-575-4909"});
		parameterMap.put("dob_year", new String[]{"1963"});
		parameterMap.put("dob_month", new String[]{"9"});
		parameterMap.put("dob_day", new String[]{"14"});
		parameterMap.put("license_state", new String[]{"NY"});
		parameterMap.put("license", new String[]{"6384072519"});
		parameterMap.put("exp_year", new String[]{"2020"});
		parameterMap.put("exp_month", new String[]{"9"});
		parameterMap.put("exp_day", new String[]{"14"});
		assertTrue("step3", instance.step3(parameterMap).isEmpty());
		parameterMap.clear();
		
		parameterMap.put("creditcard", new String[]{"7256122112421549"});
		parameterMap.put("securitycode", new String[]{"542"});
		parameterMap.put("exp_year", new String[]{"2015"});
		parameterMap.put("exp_month", new String[]{"9"});
		parameterMap.put("firstname", new String[]{"Robert"});
		parameterMap.put("lastname", new String[]{"Herjavec"});
		parameterMap.put("street1", new String[]{"One Rockefeller Plaza"});
		parameterMap.put("street2", new String[]{""});
		parameterMap.put("city", new String[]{"New York"});
		parameterMap.put("state", new String[]{"NY"});
		parameterMap.put("zip", new String[]{"10020"});
		assertTrue("step4", instance.step4(parameterMap).isEmpty());
		parameterMap.clear();
	}
	
	@Test
	public void Kevin_OLeary() {
		registration_mod instance = new registration_mod();
		Map<String, String[]> parameterMap = new HashMap<String, String[]>();
		
		parameterMap.put("username", new String[]{"kevinoleary"});
		parameterMap.put("password", new String[]{"Mr.Wonderful", "Mr.Wonderful"});
		parameterMap.put("email", new String[]{"oleary@kevinoleary.com"});
		assertTrue("step", instance.step(parameterMap).isEmpty());
		parameterMap.clear();
		
		parameterMap.put("name", new String[]{"work"});
		parameterMap.put("street1", new String[]{"PO Box 459"});
		parameterMap.put("street2", new String[]{"ATTN www.kevinoleary.com"});
		parameterMap.put("city", new String[]{"Drums"});
		parameterMap.put("state", new String[]{"PA"});
		parameterMap.put("zip", new String[]{"18222"});
		assertTrue("step1", instance.step1(parameterMap).isEmpty());
		parameterMap.clear();
		
		parameterMap.put("1", new String[]{"Select"});
		assertTrue("step2", instance.step2(parameterMap).isEmpty());
		parameterMap.clear();
		
		parameterMap.put("firstname", new String[]{"Kevin"});
		parameterMap.put("middlename", new String[]{""});
		parameterMap.put("lastname", new String[]{"O'Leary"});
		parameterMap.put("phonenumber", new String[]{"570-708-8780"});
		parameterMap.put("dob_year", new String[]{"1954"});
		parameterMap.put("dob_month", new String[]{"7"});
		parameterMap.put("dob_day", new String[]{"9"});
		parameterMap.put("license_state", new String[]{"CA"});
		parameterMap.put("license", new String[]{"0678912534"});
		parameterMap.put("exp_year", new String[]{"2015"});
		parameterMap.put("exp_month", new String[]{"7"});
		parameterMap.put("exp_day", new String[]{"9"});
		assertTrue("step3", instance.step3(parameterMap).isEmpty());
		parameterMap.clear();
		
		parameterMap.put("creditcard", new String[]{"9409515748134068"});
		parameterMap.put("securitycode", new String[]{"342"});
		parameterMap.put("exp_year", new String[]{"2016"});
		parameterMap.put("exp_month", new String[]{"7"});
		parameterMap.put("firstname", new String[]{"Kevin"});
		parameterMap.put("lastname", new String[]{"O'Leary"});
		parameterMap.put("street1", new String[]{"PO Box 459"});
		parameterMap.put("street2", new String[]{"ATTN www.kevinoleary.com"});
		parameterMap.put("city", new String[]{"Drums"});
		parameterMap.put("state", new String[]{"PA"});
		parameterMap.put("zip", new String[]{"18222"});
		assertTrue("step4", instance.step4(parameterMap).isEmpty());
		parameterMap.clear();
	}
	
	@Test
	public void Barbara_Corcoran() {
		registration_mod instance = new registration_mod();
		Map<String, String[]> parameterMap = new HashMap<String, String[]>();
		
		parameterMap.put("username", new String[]{"barbaracorcoran"});
		parameterMap.put("password", new String[]{"RealEstateIsMyBitch", "RealEstateIsMyBitch"});
		parameterMap.put("email", new String[]{"corcoran@barbaracorcoran.com"});
		assertTrue("step", instance.step(parameterMap).isEmpty());
		parameterMap.clear();
		
		parameterMap.put("name", new String[]{"school"});
		parameterMap.put("street1", new String[]{"226 W 26th St, 8th Floor"});
		parameterMap.put("street2", new String[]{""});
		parameterMap.put("city", new String[]{"New York"});
		parameterMap.put("state", new String[]{"NY"});
		parameterMap.put("zip", new String[]{"10001"});
		assertTrue("step1", instance.step1(parameterMap).isEmpty());
		parameterMap.clear();
		
		parameterMap.put("1", new String[]{"Select"});
		assertTrue("step2", instance.step2(parameterMap).isEmpty());
		parameterMap.clear();
		
		parameterMap.put("firstname", new String[]{"Barbara"});
		parameterMap.put("middlename", new String[]{""});
		parameterMap.put("lastname", new String[]{"Corcoran"});
		parameterMap.put("phonenumber", new String[]{"1-212-848-0450"});
		parameterMap.put("dob_year", new String[]{"1949"});
		parameterMap.put("dob_month", new String[]{"3"});
		parameterMap.put("dob_day", new String[]{"10"});
		parameterMap.put("license_state", new String[]{"NY"});
		parameterMap.put("license", new String[]{"9718364520"});
		parameterMap.put("exp_year", new String[]{"2020"});
		parameterMap.put("exp_month", new String[]{"3"});
		parameterMap.put("exp_day", new String[]{"10"});
		assertTrue("step3", instance.step3(parameterMap).isEmpty());
		parameterMap.clear();
		
		parameterMap.put("creditcard", new String[]{"9884321875256678"});
		parameterMap.put("securitycode", new String[]{"515"});
		parameterMap.put("exp_year", new String[]{"2016"});
		parameterMap.put("exp_month", new String[]{"1"});
		parameterMap.put("firstname", new String[]{"Barbara"});
		parameterMap.put("lastname", new String[]{"Corcoran"});
		parameterMap.put("street1", new String[]{"226 W 26th St, 8th Floor"});
		parameterMap.put("street2", new String[]{""});
		parameterMap.put("city", new String[]{"New York"});
		parameterMap.put("state", new String[]{"NY"});
		parameterMap.put("zip", new String[]{"10001"});
		assertTrue("step4", instance.step4(parameterMap).isEmpty());
		parameterMap.clear();
	}
	
	@Test
	public void Daymond_John() {
		registration_mod instance = new registration_mod();
		Map<String, String[]> parameterMap = new HashMap<String, String[]>();
		
		parameterMap.put("username", new String[]{"daymondjohn"});
		parameterMap.put("password", new String[]{"TheSharkDaymond", "TheSharkDaymond"});
		parameterMap.put("email", new String[]{"john@daymondjohn.com"});
		assertTrue("step", instance.step(parameterMap).isEmpty());
		parameterMap.clear();
		
		parameterMap.put("name", new String[]{"home"});
		parameterMap.put("street1", new String[]{"350 Fifth Avenue"});
		parameterMap.put("street2", new String[]{""});
		parameterMap.put("city", new String[]{"New York"});
		parameterMap.put("state", new String[]{"NY"});
		parameterMap.put("zip", new String[]{"10118"});
		assertTrue("step1", instance.step1(parameterMap).isEmpty());
		parameterMap.clear();
		
		parameterMap.put("1", new String[]{"Select"});
		assertTrue("step2", instance.step2(parameterMap).isEmpty());
		parameterMap.clear();
		
		parameterMap.put("firstname", new String[]{"Daymond"});
		parameterMap.put("middlename", new String[]{""});
		parameterMap.put("lastname", new String[]{"John"});
		parameterMap.put("phonenumber", new String[]{"1-212-273-3300"});
		parameterMap.put("dob_year", new String[]{"1969"});
		parameterMap.put("dob_month", new String[]{"2"});
		parameterMap.put("dob_day", new String[]{"23"});
		parameterMap.put("license_state", new String[]{"NY"});
		parameterMap.put("license", new String[]{"9528406731"});
		parameterMap.put("exp_year", new String[]{"2019"});
		parameterMap.put("exp_month", new String[]{"2"});
		parameterMap.put("exp_day", new String[]{"23"});
		assertTrue("step3", instance.step3(parameterMap).isEmpty());
		parameterMap.clear();
		
		parameterMap.put("creditcard", new String[]{"5505402713243716"});
		parameterMap.put("securitycode", new String[]{"743"});
		parameterMap.put("exp_year", new String[]{"2016"});
		parameterMap.put("exp_month", new String[]{"6"});
		parameterMap.put("firstname", new String[]{"Daymond"});
		parameterMap.put("lastname", new String[]{"John"});
		parameterMap.put("street1", new String[]{"350 Fifth Avenue"});
		parameterMap.put("street2", new String[]{""});
		parameterMap.put("city", new String[]{"New York"});
		parameterMap.put("state", new String[]{"NY"});
		parameterMap.put("zip", new String[]{"10118"});
		assertTrue("step4", instance.step4(parameterMap).isEmpty());
		parameterMap.clear();
	}
	
	@Test
	public void Mark_Cuban() {
		registration_mod instance = new registration_mod();
		Map<String, String[]> parameterMap = new HashMap<String, String[]>();
		
		parameterMap.put("username", new String[]{"markcuban"});
		parameterMap.put("password", new String[]{"IOwnDallasMavericks", "IOwnDallasMavericks"});
		parameterMap.put("email", new String[]{"cuban@blogmaverick.com"});
		assertTrue("step", instance.step(parameterMap).isEmpty());
		parameterMap.clear();
		
		parameterMap.put("name", new String[]{"home"});
		parameterMap.put("street1", new String[]{"5424 Deloache Avenue"});
		parameterMap.put("street2", new String[]{""});
		parameterMap.put("city", new String[]{"Dallas"});
		parameterMap.put("state", new String[]{"TX"});
		parameterMap.put("zip", new String[]{"75220"});
		assertTrue("step1", instance.step1(parameterMap).isEmpty());
		parameterMap.clear();
		
		parameterMap.put("1", new String[]{"Select"});
		assertTrue("step2", instance.step2(parameterMap).isEmpty());
		parameterMap.clear();
		
		parameterMap.put("firstname", new String[]{"Mark"});
		parameterMap.put("middlename", new String[]{""});
		parameterMap.put("lastname", new String[]{"Cuban"});
		parameterMap.put("phonenumber", new String[]{"214-378-5301"});
		parameterMap.put("dob_year", new String[]{"1958"});
		parameterMap.put("dob_month", new String[]{"7"});
		parameterMap.put("dob_day", new String[]{"31"});
		parameterMap.put("license_state", new String[]{"TX"});
		parameterMap.put("license", new String[]{"7385019264"});
		parameterMap.put("exp_year", new String[]{"2016"});
		parameterMap.put("exp_month", new String[]{"7"});
		parameterMap.put("exp_day", new String[]{"31"});
		assertTrue("step3", instance.step3(parameterMap).isEmpty());
		parameterMap.clear();
		
		parameterMap.put("creditcard", new String[]{"4893480754942318"});
		parameterMap.put("securitycode", new String[]{"532"});
		parameterMap.put("exp_year", new String[]{"2014"});
		parameterMap.put("exp_month", new String[]{"8"});
		parameterMap.put("firstname", new String[]{"Mark"});
		parameterMap.put("lastname", new String[]{"Cuban"});
		parameterMap.put("street1", new String[]{"5424 Deloache Avenue"});
		parameterMap.put("street2", new String[]{""});
		parameterMap.put("city", new String[]{"Dallas"});
		parameterMap.put("state", new String[]{"TX"});
		parameterMap.put("zip", new String[]{"75220"});
		assertTrue("step4", instance.step4(parameterMap).isEmpty());
		parameterMap.clear();
	}
	
	@Test
	public void Lori_Greiner() {
		registration_mod instance = new registration_mod();
		Map<String, String[]> parameterMap = new HashMap<String, String[]>();
		
		parameterMap.put("username", new String[]{"lorigreiner"});
		parameterMap.put("password", new String[]{"QueenOfQVC", "QueenOfQVC"});
		parameterMap.put("email", new String[]{"greiner@lorigreiner.com"});
		assertTrue("step", instance.step(parameterMap).isEmpty());
		parameterMap.clear();
		
		parameterMap.put("name", new String[]{"work"});
		parameterMap.put("street1", new String[]{"1301 N Dearborn Pkwy"});
		parameterMap.put("street2", new String[]{""});
		parameterMap.put("city", new String[]{"Chicago"});
		parameterMap.put("state", new String[]{"IL"});
		parameterMap.put("zip", new String[]{"60610"});
		assertTrue("step1", instance.step1(parameterMap).isEmpty());
		parameterMap.clear();
		
		parameterMap.put("1", new String[]{"Select"});
		assertTrue("step2", instance.step2(parameterMap).isEmpty());
		parameterMap.clear();
		
		parameterMap.put("firstname", new String[]{"Lori"});
		parameterMap.put("middlename", new String[]{""});
		parameterMap.put("lastname", new String[]{"Greiner"});
		parameterMap.put("phonenumber", new String[]{"630-834-3771"});
		parameterMap.put("dob_year", new String[]{"1969"});
		parameterMap.put("dob_month", new String[]{"12"});
		parameterMap.put("dob_day", new String[]{"9"});
		parameterMap.put("license_state", new String[]{"IL"});
		parameterMap.put("license", new String[]{"5068927431"});
		parameterMap.put("exp_year", new String[]{"2015"});
		parameterMap.put("exp_month", new String[]{"12"});
		parameterMap.put("exp_day", new String[]{"9"});
		assertTrue("step3", instance.step3(parameterMap).isEmpty());
		parameterMap.clear();
		
		parameterMap.put("creditcard", new String[]{"7109038036703853"});
		parameterMap.put("securitycode", new String[]{"134"});
		parameterMap.put("exp_year", new String[]{"2016"});
		parameterMap.put("exp_month", new String[]{"9"});
		parameterMap.put("firstname", new String[]{"Lori"});
		parameterMap.put("lastname", new String[]{"Greiner"});
		parameterMap.put("street1", new String[]{"1301 N Dearborn Pkwy"});
		parameterMap.put("street2", new String[]{""});
		parameterMap.put("city", new String[]{"Chicago"});
		parameterMap.put("state", new String[]{"IL"});
		parameterMap.put("zip", new String[]{"60610"});
		assertTrue("step4", instance.step4(parameterMap).isEmpty());
		parameterMap.clear();
	}
	
	@Test
	public void Steve_Tisch() {
		registration_mod instance = new registration_mod();
		Map<String, String[]> parameterMap = new HashMap<String, String[]>();
		
		parameterMap.put("username", new String[]{"stevetisch"});
		parameterMap.put("password", new String[]{"Giants1", "Giants1"});
		parameterMap.put("email", new String[]{"tisch@giants.com"});
		assertTrue("step", instance.step(parameterMap).isEmpty());
		parameterMap.clear();
		
		parameterMap.put("name", new String[]{"home"});
		parameterMap.put("street1", new String[]{"ATTN www.stevetisch.com PO Box 459"});
		parameterMap.put("street2", new String[]{""});
		parameterMap.put("city", new String[]{"Drums"});
		parameterMap.put("state", new String[]{"PA"});
		parameterMap.put("zip", new String[]{"18222"});
		assertTrue("step1", instance.step1(parameterMap).isEmpty());
		parameterMap.clear();
		
		parameterMap.put("1", new String[]{"Select"});
		assertTrue("step2", instance.step2(parameterMap).isEmpty());
		parameterMap.clear();
		
		parameterMap.put("firstname", new String[]{"Steve"});
		parameterMap.put("middlename", new String[]{""});
		parameterMap.put("lastname", new String[]{"Tisch"});
		parameterMap.put("phonenumber", new String[]{"570-708-8780"});
		parameterMap.put("dob_year", new String[]{"1949"});
		parameterMap.put("dob_month", new String[]{"2"});
		parameterMap.put("dob_day", new String[]{"14"});
		parameterMap.put("license_state", new String[]{"PA"});
		parameterMap.put("license", new String[]{"1906583247"});
		parameterMap.put("exp_year", new String[]{"2020"});
		parameterMap.put("exp_month", new String[]{"2"});
		parameterMap.put("exp_day", new String[]{"14"});
		assertTrue("step3", instance.step3(parameterMap).isEmpty());
		parameterMap.clear();
		
		parameterMap.put("creditcard", new String[]{"4328138632415507"});
		parameterMap.put("securitycode", new String[]{"050"});
		parameterMap.put("exp_year", new String[]{"2016"});
		parameterMap.put("exp_month", new String[]{"11"});
		parameterMap.put("firstname", new String[]{"Steve"});
		parameterMap.put("lastname", new String[]{"Tisch"});
		parameterMap.put("street1", new String[]{"ATTN www.stevetisch.com PO Box 459"});
		parameterMap.put("street2", new String[]{""});
		parameterMap.put("city", new String[]{"Drums"});
		parameterMap.put("state", new String[]{"PA"});
		parameterMap.put("zip", new String[]{"18222"});
		assertTrue("step4", instance.step4(parameterMap).isEmpty());
		parameterMap.clear();
	}
	
	@Test
	public void John_Paul_DeJoria() {
		registration_mod instance = new registration_mod();
		Map<String, String[]> parameterMap = new HashMap<String, String[]>();
		
		parameterMap.put("username", new String[]{"johndejoria"});
		parameterMap.put("password", new String[]{"iPaulMitchell", "iPaulMitchell"});
		parameterMap.put("email", new String[]{"dejoria@paulmitchell.com"});
		assertTrue("step", instance.step(parameterMap).isEmpty());
		parameterMap.clear();
		
		parameterMap.put("name", new String[]{"home"});
		parameterMap.put("street1", new String[]{"20705 Centre Pointe Pkwy"});
		parameterMap.put("street2", new String[]{""});
		parameterMap.put("city", new String[]{"Santa Clarita"});
		parameterMap.put("state", new String[]{"CA"});
		parameterMap.put("zip", new String[]{"91350"});
		assertTrue("step1", instance.step1(parameterMap).isEmpty());
		parameterMap.clear();
		
		parameterMap.put("1", new String[]{"Select"});
		assertTrue("step2", instance.step2(parameterMap).isEmpty());
		parameterMap.clear();
		
		parameterMap.put("firstname", new String[]{"John"});
		parameterMap.put("middlename", new String[]{"Paul"});
		parameterMap.put("lastname", new String[]{"DeJoria"});
		parameterMap.put("phonenumber", new String[]{"661-298-0400"});
		parameterMap.put("dob_year", new String[]{"1944"});
		parameterMap.put("dob_month", new String[]{"4"});
		parameterMap.put("dob_day", new String[]{"13"});
		parameterMap.put("license_state", new String[]{"CA"});
		parameterMap.put("license", new String[]{"8609752431"});
		parameterMap.put("exp_year", new String[]{"2021"});
		parameterMap.put("exp_month", new String[]{"4"});
		parameterMap.put("exp_day", new String[]{"13"});
		assertTrue("step3", instance.step3(parameterMap).isEmpty());
		parameterMap.clear();
		
		parameterMap.put("creditcard", new String[]{"8211374501392440"});
		parameterMap.put("securitycode", new String[]{"963"});
		parameterMap.put("exp_year", new String[]{"2015"});
		parameterMap.put("exp_month", new String[]{"12"});
		parameterMap.put("firstname", new String[]{"John"});
		parameterMap.put("lastname", new String[]{"DeJoria"});
		parameterMap.put("street1", new String[]{"20705 Centre Pointe Pkwy"});
		parameterMap.put("street2", new String[]{""});
		parameterMap.put("city", new String[]{"Santa Clarita"});
		parameterMap.put("state", new String[]{"CA"});
		parameterMap.put("zip", new String[]{"91350"});
		assertTrue("step4", instance.step4(parameterMap).isEmpty());
		parameterMap.clear();
	}
	
	@Test
	public void Kevin_Harrington() {
		registration_mod instance = new registration_mod();
		Map<String, String[]> parameterMap = new HashMap<String, String[]>();
		
		parameterMap.put("username", new String[]{"kevinharrington"});
		parameterMap.put("password", new String[]{"TheAmbassador", "TheAmbassador"});
		parameterMap.put("email", new String[]{"harrington@kevinharrington.tv"});
		assertTrue("step", instance.step(parameterMap).isEmpty());
		parameterMap.clear();
		
		parameterMap.put("name", new String[]{"home"});
		parameterMap.put("street1", new String[]{"300 10th St S"});
		parameterMap.put("street2", new String[]{"Apt 844"});
		parameterMap.put("city", new String[]{"St. Petersburg"});
		parameterMap.put("state", new String[]{"FL"});
		parameterMap.put("zip", new String[]{"33705"});
		assertTrue("step1", instance.step1(parameterMap).isEmpty());
		parameterMap.clear();
		
		parameterMap.put("1", new String[]{"Select"});
		assertTrue("step2", instance.step2(parameterMap).isEmpty());
		parameterMap.clear();
		
		parameterMap.put("firstname", new String[]{"Kevin"});
		parameterMap.put("middlename", new String[]{""});
		parameterMap.put("lastname", new String[]{"Harrington"});
		parameterMap.put("phonenumber", new String[]{"1-267-979-3779"});
		parameterMap.put("dob_year", new String[]{"1957"});
		parameterMap.put("dob_month", new String[]{"6"});
		parameterMap.put("dob_day", new String[]{"4"});
		parameterMap.put("license_state", new String[]{"FL"});
		parameterMap.put("license", new String[]{"5142930876"});
		parameterMap.put("exp_year", new String[]{"2020"});
		parameterMap.put("exp_month", new String[]{"6"});
		parameterMap.put("exp_day", new String[]{"4"});
		assertTrue("step3", instance.step3(parameterMap).isEmpty());
		parameterMap.clear();
		
		parameterMap.put("creditcard", new String[]{"3050811119663855"});
		parameterMap.put("securitycode", new String[]{"041"});
		parameterMap.put("exp_year", new String[]{"2015"});
		parameterMap.put("exp_month", new String[]{"10"});
		parameterMap.put("firstname", new String[]{"Kevin"});
		parameterMap.put("lastname", new String[]{"Harrington"});
		parameterMap.put("street1", new String[]{"300 10th St S"});
		parameterMap.put("street2", new String[]{"Apt 844"});
		parameterMap.put("city", new String[]{"St. Petersburg"});
		parameterMap.put("state", new String[]{"FL"});
		parameterMap.put("zip", new String[]{"33705"});
		assertTrue("step4", instance.step4(parameterMap).isEmpty());
		parameterMap.clear();
	}
	
	@Test
	public void Jeff_Foxworthy() {
		registration_mod instance = new registration_mod();
		Map<String, String[]> parameterMap = new HashMap<String, String[]>();
		
		parameterMap.put("username", new String[]{"jefffoxworthy"});
		parameterMap.put("password", new String[]{"IAmMarshall", "IAmMarshall"});
		parameterMap.put("email", new String[]{"foxworthy@jefffoxworthy.com"});
		assertTrue("step", instance.step(parameterMap).isEmpty());
		parameterMap.clear();
		
		parameterMap.put("name", new String[]{"home"});
		parameterMap.put("street1", new String[]{"143 4th Ave N"});
		parameterMap.put("street2", new String[]{"Suite 300"});
		parameterMap.put("city", new String[]{"Franklin"});
		parameterMap.put("state", new String[]{"TN"});
		parameterMap.put("zip", new String[]{"37064"});
		assertTrue("step1", instance.step1(parameterMap).isEmpty());
		parameterMap.clear();
		
		parameterMap.put("1", new String[]{"Select"});
		assertTrue("step2", instance.step2(parameterMap).isEmpty());
		parameterMap.clear();
		
		parameterMap.put("firstname", new String[]{"Jeff"});
		parameterMap.put("middlename", new String[]{""});
		parameterMap.put("lastname", new String[]{"Foxworthy"});
		parameterMap.put("phonenumber", new String[]{"1-615-584-2774"});
		parameterMap.put("dob_year", new String[]{"1958"});
		parameterMap.put("dob_month", new String[]{"9"});
		parameterMap.put("dob_day", new String[]{"6"});
		parameterMap.put("license_state", new String[]{"TN"});
		parameterMap.put("license", new String[]{"6753809214"});
		parameterMap.put("exp_year", new String[]{"2020"});
		parameterMap.put("exp_month", new String[]{"9"});
		parameterMap.put("exp_day", new String[]{"6"});
		assertTrue("step3", instance.step3(parameterMap).isEmpty());
		parameterMap.clear();
		
		parameterMap.put("creditcard", new String[]{"8693254776550439"});
		parameterMap.put("securitycode", new String[]{"753"});
		parameterMap.put("exp_year", new String[]{"2015"});
		parameterMap.put("exp_month", new String[]{"5"});
		parameterMap.put("firstname", new String[]{"Jeff"});
		parameterMap.put("lastname", new String[]{"Foxworthy"});
		parameterMap.put("street1", new String[]{"143 4th Ave N"});
		parameterMap.put("street2", new String[]{"Suite 300"});
		parameterMap.put("city", new String[]{"Franklin"});
		parameterMap.put("state", new String[]{"TN"});
		parameterMap.put("zip", new String[]{"37064"});
		assertTrue("step4", instance.step4(parameterMap).isEmpty());
		parameterMap.clear();
	}
}