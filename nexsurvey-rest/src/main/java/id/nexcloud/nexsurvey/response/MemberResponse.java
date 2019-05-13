package id.nexcloud.nexsurvey.response;

import java.io.File;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MemberResponse {

	private Long id;
	private String fullName;
	private String status;
	private String idNumber;
	private String address;
	private String city;
	private String postCode;
	private String phoneNumber;
	private String mobilePhone;
	private String fax;
	private String email;
	private String accountNumber;
	private String accountName;
	private String bank;
	private String branch;
	private String taxpayerIdNumber;
	private String taxpayerName;
	private String logoPath;
	private String idCardPath;
	private String taxpayerIdNumberPath;
	private String role;
	private String language;
	private File logoFile;
	private File ktpFile;
	private File npwpFile;

}
