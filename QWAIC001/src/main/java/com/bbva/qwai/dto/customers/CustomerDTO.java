package com.bbva.qwai.dto.customers;

import com.bbva.apx.dto.AbstractDTO;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Date;
/**
 * The CustomerDTO class...
 */
public class CustomerDTO extends AbstractDTO {
	private static final long serialVersionUID = 2931699728946643245L;

    private String customerId;
    private String firstName;
    private String lastName;
    private String nationality;
    private String personalTitle;
    private String genderId;
    private String identityDocumentType;
    private String identityDocumentNumber;
    private Date birthDate;
    private String maritalStatus;

	
	 
    public String getCustomerId() {
		return customerId;
}
public void setCustomerId(String customerId) {
		this.customerId = customerId;
}
public String getFirstName() {
		return firstName;
}
public void setFirstName(String firstName) {
		this.firstName = firstName;
}
public String getLastName() {
		return lastName;
}
public void setLastName(String lastName) {
		this.lastName = lastName;
}
public String getNationality() {
		return nationality;
}
public void setNationality(String nationality) {
		this.nationality = nationality;
}
public String getPersonalTitle() {
		return personalTitle;
}
public void setPersonalTitle(String personalTitle) {
		this.personalTitle = personalTitle;
}
public String getGenderId() {
		return genderId;
}
public void setGenderId(String genderId) {
		this.genderId = genderId;
}
public String getIdentityDocumentType() {
		return identityDocumentType;
}
public void setIdentityDocumentType(String identityDocumentType) {
		this.identityDocumentType = identityDocumentType;
}
public String getIdentityDocumentNumber() {
		return identityDocumentNumber;
}
public void setIdentityDocumentNumber(String identityDocumentNumber) {
		this.identityDocumentNumber = identityDocumentNumber;
}
public Date getBirthDate() {
		return birthDate;
}
public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
}
public String getMaritalStatus() {
		return maritalStatus;
}
public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
}


@Override
public boolean equals(final Object obj) {
		if (obj == null) { return false; }
		if (obj == this) { return true; }
		if (obj.getClass() != getClass()) {
				return false;
		}
		final CustomerDTO rhs = (CustomerDTO) obj;
		return new EqualsBuilder().appendSuper(super.equals(obj))
								.append(customerId, rhs.customerId)
								.append(firstName, rhs.firstName)
								.append(lastName, rhs.lastName)
								.append(nationality, rhs.nationality)
								.append(personalTitle, rhs.personalTitle)
								.append(genderId, rhs.genderId)
								.append(identityDocumentType, rhs.identityDocumentType)
								.append(identityDocumentNumber, rhs.identityDocumentNumber)
								.append(birthDate, rhs.birthDate)
								.append(maritalStatus, rhs.maritalStatus)
								.isEquals();
}


@Override
public int hashCode() {
		return new HashCodeBuilder()
				.append(this.customerId)
				.append(this.firstName)
				.append(this.lastName)
				.append(this.nationality)
				.append(this.personalTitle)
				.append(this.genderId)
				.append(this.identityDocumentType)
				.append(this.identityDocumentNumber)
				.append(this.maritalStatus)
				.toHashCode();
}
 
@Override
public String toString() {
		return new ToStringBuilder(this)
				.append("customerId", customerId)
				.append("firstName", firstName)
				.append("lastName", lastName)
				.append("nationality", nationality)
				.append("personalTitle", personalTitle)
				.append("genderId", genderId)
				.append("identityDocumentType", identityDocumentType)
				.append("identityDocumentNumber", identityDocumentNumber)
				.append("birthDate", birthDate)
				.append("maritalStatus", maritalStatus)
				.toString();
}


}
