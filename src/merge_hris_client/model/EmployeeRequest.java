/*
 * Merge HRIS API
 * The unified API for building rich integrations with multiple HR Information System platforms.
 *
 * The version of the OpenAPI document: 1.0
 * Contact: hello@merge.dev
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package merge_hris_client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;
import java.util.UUID;
import merge_hris_client.model.EmploymentStatusEnum;
import merge_hris_client.model.EthnicityEnum;
import merge_hris_client.model.GenderEnum;
import merge_hris_client.model.MaritalStatusEnum;
import org.threeten.bp.OffsetDateTime;

/**
 * # The Employee Object ### Description The &#x60;Employee&#x60; object is used to represent an Employee for a company.  ### Usage Example Fetch from the &#x60;LIST Employee&#x60; endpoint and filter by &#x60;ID&#x60; to show all employees.
 */
@ApiModel(description = "# The Employee Object ### Description The `Employee` object is used to represent an Employee for a company.  ### Usage Example Fetch from the `LIST Employee` endpoint and filter by `ID` to show all employees.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-06-01T21:16:36.893509-04:00[America/New_York]")
public class EmployeeRequest {
  public static final String SERIALIZED_NAME_REMOTE_ID = "remote_id";
  @SerializedName(SERIALIZED_NAME_REMOTE_ID)
  private String remoteId;

  public static final String SERIALIZED_NAME_EMPLOYEE_NUMBER = "employee_number";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_NUMBER)
  private String employeeNumber;

  public static final String SERIALIZED_NAME_COMPANY = "company";
  @SerializedName(SERIALIZED_NAME_COMPANY)
  private UUID company;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_DISPLAY_FULL_NAME = "display_full_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_FULL_NAME)
  private String displayFullName;

  public static final String SERIALIZED_NAME_WORK_EMAIL = "work_email";
  @SerializedName(SERIALIZED_NAME_WORK_EMAIL)
  private String workEmail;

  public static final String SERIALIZED_NAME_PERSONAL_EMAIL = "personal_email";
  @SerializedName(SERIALIZED_NAME_PERSONAL_EMAIL)
  private String personalEmail;

  public static final String SERIALIZED_NAME_MOBILE_PHONE_NUMBER = "mobile_phone_number";
  @SerializedName(SERIALIZED_NAME_MOBILE_PHONE_NUMBER)
  private String mobilePhoneNumber;

  public static final String SERIALIZED_NAME_HOME_LOCATION = "home_location";
  @SerializedName(SERIALIZED_NAME_HOME_LOCATION)
  private UUID homeLocation;

  public static final String SERIALIZED_NAME_WORK_LOCATION = "work_location";
  @SerializedName(SERIALIZED_NAME_WORK_LOCATION)
  private UUID workLocation;

  public static final String SERIALIZED_NAME_MANAGER = "manager";
  @SerializedName(SERIALIZED_NAME_MANAGER)
  private UUID manager;

  public static final String SERIALIZED_NAME_TEAM = "team";
  @SerializedName(SERIALIZED_NAME_TEAM)
  private UUID team;

  public static final String SERIALIZED_NAME_SSN = "ssn";
  @SerializedName(SERIALIZED_NAME_SSN)
  private String ssn;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private GenderEnum gender;

  public static final String SERIALIZED_NAME_ETHNICITY = "ethnicity";
  @SerializedName(SERIALIZED_NAME_ETHNICITY)
  private EthnicityEnum ethnicity;

  public static final String SERIALIZED_NAME_MARITAL_STATUS = "marital_status";
  @SerializedName(SERIALIZED_NAME_MARITAL_STATUS)
  private MaritalStatusEnum maritalStatus;

  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "date_of_birth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  private OffsetDateTime dateOfBirth;

  public static final String SERIALIZED_NAME_HIRE_DATE = "hire_date";
  @SerializedName(SERIALIZED_NAME_HIRE_DATE)
  private OffsetDateTime hireDate;

  public static final String SERIALIZED_NAME_EMPLOYMENT_STATUS = "employment_status";
  @SerializedName(SERIALIZED_NAME_EMPLOYMENT_STATUS)
  private EmploymentStatusEnum employmentStatus;

  public static final String SERIALIZED_NAME_TERMINATION_DATE = "termination_date";
  @SerializedName(SERIALIZED_NAME_TERMINATION_DATE)
  private OffsetDateTime terminationDate;

  public static final String SERIALIZED_NAME_AVATAR = "avatar";
  @SerializedName(SERIALIZED_NAME_AVATAR)
  private URI avatar;


  public EmployeeRequest remoteId(String remoteId) {
    
    this.remoteId = remoteId;
    return this;
  }

   /**
   * The third-party API ID of the matching object.
   * @return remoteId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "19202938", value = "The third-party API ID of the matching object.")

  public String getRemoteId() {
    return remoteId;
  }


  public void setRemoteId(String remoteId) {
    this.remoteId = remoteId;
  }


  public EmployeeRequest employeeNumber(String employeeNumber) {
    
    this.employeeNumber = employeeNumber;
    return this;
  }

   /**
   * The employee&#39;s number that appears in the remote UI. Note: This is distinct from the remote_id field, which is a unique identifier for the employee set by the remote API, and is not exposed to the user.
   * @return employeeNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "The employee's number that appears in the remote UI. Note: This is distinct from the remote_id field, which is a unique identifier for the employee set by the remote API, and is not exposed to the user.")

  public String getEmployeeNumber() {
    return employeeNumber;
  }


  public void setEmployeeNumber(String employeeNumber) {
    this.employeeNumber = employeeNumber;
  }


  public EmployeeRequest company(UUID company) {
    
    this.company = company;
    return this;
  }

   /**
   * The ID of the employee&#39;s company.
   * @return company
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8d9fd929-436c-4fd4-a48b-0c61f68d6178", value = "The ID of the employee's company.")

  public UUID getCompany() {
    return company;
  }


  public void setCompany(UUID company) {
    this.company = company;
  }


  public EmployeeRequest firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * The employee&#39;s first name.
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Jane", value = "The employee's first name.")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public EmployeeRequest lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * The employee&#39;s last name.
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Doe", value = "The employee's last name.")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public EmployeeRequest displayFullName(String displayFullName) {
    
    this.displayFullName = displayFullName;
    return this;
  }

   /**
   * The employee&#39;s full name, to use for display purposes.
   * @return displayFullName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Jane Doe", value = "The employee's full name, to use for display purposes.")

  public String getDisplayFullName() {
    return displayFullName;
  }


  public void setDisplayFullName(String displayFullName) {
    this.displayFullName = displayFullName;
  }


  public EmployeeRequest workEmail(String workEmail) {
    
    this.workEmail = workEmail;
    return this;
  }

   /**
   * The employee&#39;s work email.
   * @return workEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "jane@merge.dev", value = "The employee's work email.")

  public String getWorkEmail() {
    return workEmail;
  }


  public void setWorkEmail(String workEmail) {
    this.workEmail = workEmail;
  }


  public EmployeeRequest personalEmail(String personalEmail) {
    
    this.personalEmail = personalEmail;
    return this;
  }

   /**
   * The employee&#39;s personal email.
   * @return personalEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "jane@gmail.com", value = "The employee's personal email.")

  public String getPersonalEmail() {
    return personalEmail;
  }


  public void setPersonalEmail(String personalEmail) {
    this.personalEmail = personalEmail;
  }


  public EmployeeRequest mobilePhoneNumber(String mobilePhoneNumber) {
    
    this.mobilePhoneNumber = mobilePhoneNumber;
    return this;
  }

   /**
   * The employee&#39;s mobile phone number.
   * @return mobilePhoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "+1234567890", value = "The employee's mobile phone number.")

  public String getMobilePhoneNumber() {
    return mobilePhoneNumber;
  }


  public void setMobilePhoneNumber(String mobilePhoneNumber) {
    this.mobilePhoneNumber = mobilePhoneNumber;
  }


  public EmployeeRequest homeLocation(UUID homeLocation) {
    
    this.homeLocation = homeLocation;
    return this;
  }

   /**
   * The employee&#39;s home address.
   * @return homeLocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "d2f972d0-2526-434b-9409-4c3b468e08f0", value = "The employee's home address.")

  public UUID getHomeLocation() {
    return homeLocation;
  }


  public void setHomeLocation(UUID homeLocation) {
    this.homeLocation = homeLocation;
  }


  public EmployeeRequest workLocation(UUID workLocation) {
    
    this.workLocation = workLocation;
    return this;
  }

   /**
   * The employee&#39;s work address.
   * @return workLocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "9efbc633-3387-4306-aa55-e2c635e6bb4f", value = "The employee's work address.")

  public UUID getWorkLocation() {
    return workLocation;
  }


  public void setWorkLocation(UUID workLocation) {
    this.workLocation = workLocation;
  }


  public EmployeeRequest manager(UUID manager) {
    
    this.manager = manager;
    return this;
  }

   /**
   * The employee ID of the employee&#39;s manager.
   * @return manager
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0048ea5b-911e-4dff-9364-92070dea62ff", value = "The employee ID of the employee's manager.")

  public UUID getManager() {
    return manager;
  }


  public void setManager(UUID manager) {
    this.manager = manager;
  }


  public EmployeeRequest team(UUID team) {
    
    this.team = team;
    return this;
  }

   /**
   * The employee&#39;s team.
   * @return team
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "249c9faa-3045-4a31-953b-8f22d3613301", value = "The employee's team.")

  public UUID getTeam() {
    return team;
  }


  public void setTeam(UUID team) {
    this.team = team;
  }


  public EmployeeRequest ssn(String ssn) {
    
    this.ssn = ssn;
    return this;
  }

   /**
   * The employee&#39;s social security number.
   * @return ssn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234567890", value = "The employee's social security number.")

  public String getSsn() {
    return ssn;
  }


  public void setSsn(String ssn) {
    this.ssn = ssn;
  }


  public EmployeeRequest gender(GenderEnum gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * The employee&#39;s gender.
   * @return gender
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FEMALE", value = "The employee's gender.")

  public GenderEnum getGender() {
    return gender;
  }


  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }


  public EmployeeRequest ethnicity(EthnicityEnum ethnicity) {
    
    this.ethnicity = ethnicity;
    return this;
  }

   /**
   * The employee&#39;s ethnicity.
   * @return ethnicity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AMERICAN_INDIAN_OR_ALASKA_NATIVE", value = "The employee's ethnicity.")

  public EthnicityEnum getEthnicity() {
    return ethnicity;
  }


  public void setEthnicity(EthnicityEnum ethnicity) {
    this.ethnicity = ethnicity;
  }


  public EmployeeRequest maritalStatus(MaritalStatusEnum maritalStatus) {
    
    this.maritalStatus = maritalStatus;
    return this;
  }

   /**
   * The employee&#39;s marital status.
   * @return maritalStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SINGLE", value = "The employee's marital status.")

  public MaritalStatusEnum getMaritalStatus() {
    return maritalStatus;
  }


  public void setMaritalStatus(MaritalStatusEnum maritalStatus) {
    this.maritalStatus = maritalStatus;
  }


  public EmployeeRequest dateOfBirth(OffsetDateTime dateOfBirth) {
    
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * The employee&#39;s date of birth.
   * @return dateOfBirth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The employee's date of birth.")

  public OffsetDateTime getDateOfBirth() {
    return dateOfBirth;
  }


  public void setDateOfBirth(OffsetDateTime dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  public EmployeeRequest hireDate(OffsetDateTime hireDate) {
    
    this.hireDate = hireDate;
    return this;
  }

   /**
   * The employee&#39;s hire date. If an employee has multiple hire dates from previous employments, this represents the most recent hire date.
   * @return hireDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The employee's hire date. If an employee has multiple hire dates from previous employments, this represents the most recent hire date.")

  public OffsetDateTime getHireDate() {
    return hireDate;
  }


  public void setHireDate(OffsetDateTime hireDate) {
    this.hireDate = hireDate;
  }


  public EmployeeRequest employmentStatus(EmploymentStatusEnum employmentStatus) {
    
    this.employmentStatus = employmentStatus;
    return this;
  }

   /**
   * The employment status of the employee.
   * @return employmentStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ACTIVE", value = "The employment status of the employee.")

  public EmploymentStatusEnum getEmploymentStatus() {
    return employmentStatus;
  }


  public void setEmploymentStatus(EmploymentStatusEnum employmentStatus) {
    this.employmentStatus = employmentStatus;
  }


  public EmployeeRequest terminationDate(OffsetDateTime terminationDate) {
    
    this.terminationDate = terminationDate;
    return this;
  }

   /**
   * The employee&#39;s termination date.
   * @return terminationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The employee's termination date.")

  public OffsetDateTime getTerminationDate() {
    return terminationDate;
  }


  public void setTerminationDate(OffsetDateTime terminationDate) {
    this.terminationDate = terminationDate;
  }


  public EmployeeRequest avatar(URI avatar) {
    
    this.avatar = avatar;
    return this;
  }

   /**
   * The URL of the employee&#39;s avatar image.
   * @return avatar
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://alturl.com/h2h8m", value = "The URL of the employee's avatar image.")

  public URI getAvatar() {
    return avatar;
  }


  public void setAvatar(URI avatar) {
    this.avatar = avatar;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeeRequest employeeRequest = (EmployeeRequest) o;
    return Objects.equals(this.remoteId, employeeRequest.remoteId) &&
        Objects.equals(this.employeeNumber, employeeRequest.employeeNumber) &&
        Objects.equals(this.company, employeeRequest.company) &&
        Objects.equals(this.firstName, employeeRequest.firstName) &&
        Objects.equals(this.lastName, employeeRequest.lastName) &&
        Objects.equals(this.displayFullName, employeeRequest.displayFullName) &&
        Objects.equals(this.workEmail, employeeRequest.workEmail) &&
        Objects.equals(this.personalEmail, employeeRequest.personalEmail) &&
        Objects.equals(this.mobilePhoneNumber, employeeRequest.mobilePhoneNumber) &&
        Objects.equals(this.homeLocation, employeeRequest.homeLocation) &&
        Objects.equals(this.workLocation, employeeRequest.workLocation) &&
        Objects.equals(this.manager, employeeRequest.manager) &&
        Objects.equals(this.team, employeeRequest.team) &&
        Objects.equals(this.ssn, employeeRequest.ssn) &&
        Objects.equals(this.gender, employeeRequest.gender) &&
        Objects.equals(this.ethnicity, employeeRequest.ethnicity) &&
        Objects.equals(this.maritalStatus, employeeRequest.maritalStatus) &&
        Objects.equals(this.dateOfBirth, employeeRequest.dateOfBirth) &&
        Objects.equals(this.hireDate, employeeRequest.hireDate) &&
        Objects.equals(this.employmentStatus, employeeRequest.employmentStatus) &&
        Objects.equals(this.terminationDate, employeeRequest.terminationDate) &&
        Objects.equals(this.avatar, employeeRequest.avatar);
  }

  @Override
  public int hashCode() {
    return Objects.hash(remoteId, employeeNumber, company, firstName, lastName, displayFullName, workEmail, personalEmail, mobilePhoneNumber, homeLocation, workLocation, manager, team, ssn, gender, ethnicity, maritalStatus, dateOfBirth, hireDate, employmentStatus, terminationDate, avatar);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeRequest {\n");
    sb.append("    remoteId: ").append(toIndentedString(remoteId)).append("\n");
    sb.append("    employeeNumber: ").append(toIndentedString(employeeNumber)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    displayFullName: ").append(toIndentedString(displayFullName)).append("\n");
    sb.append("    workEmail: ").append(toIndentedString(workEmail)).append("\n");
    sb.append("    personalEmail: ").append(toIndentedString(personalEmail)).append("\n");
    sb.append("    mobilePhoneNumber: ").append(toIndentedString(mobilePhoneNumber)).append("\n");
    sb.append("    homeLocation: ").append(toIndentedString(homeLocation)).append("\n");
    sb.append("    workLocation: ").append(toIndentedString(workLocation)).append("\n");
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    ssn: ").append(toIndentedString(ssn)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    ethnicity: ").append(toIndentedString(ethnicity)).append("\n");
    sb.append("    maritalStatus: ").append(toIndentedString(maritalStatus)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    hireDate: ").append(toIndentedString(hireDate)).append("\n");
    sb.append("    employmentStatus: ").append(toIndentedString(employmentStatus)).append("\n");
    sb.append("    terminationDate: ").append(toIndentedString(terminationDate)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

