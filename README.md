# SSL-Encryption
This was a medium-level assignment done in JAVA that involved implementing encryption within the application and validating its functionality to ensure secure communication. 

---
**It Includes:**

- Documentation going behind the scenes talking about the thought process.
- OWASP
- SHA-256 Encryption
- Maven
- SSL/TLS Encryption
- Self-Signed Certificate
- Checksum Verification
- Secure Static Data Endpoint
- Functional Testing

---
**Rubric 1**

Competency
In this project, you will demonstrate your expectations in the following competency:

Analyze how advanced security concepts are applied to develop secure code
Scenario
You work as a developer for a software engineering company called Global Rain. Global Rain specializes in custom software design and development. The software is for entrepreneurs, businesses, and government agencies around the world. Part of the company’s mission is “Security is everyone’s responsibility.” Global Rain has promoted you to its new agile scrum team.

At Global Rain, you work with a client, Artemis Financial. Artemis Financial is a consulting company that develops individualized financial plans for its customers. The financial plans include savings, retirement, investments, and insurance.

Artemis Financial logo

Artemis Financial wants to modernize its operations. As a crucial part of the success of its custom software, the company also wants to use the latest and most effective software security. Artemis Financial has a RESTful web application programming interface (API). The company is seeking Global Rain’s expertise about how to protect the organization from external threats.

As part of the team, you must examine Artemis Financial’s web-based software application to identify any security vulnerabilities. You’ll document what you learn in a vulnerability assessment report used to mitigate the security vulnerabilities you find.

Directions
You must conduct a vulnerability assessment. In the assessment, you will examine Artemis Financial’s web-based software application. Use what you have learned so far, the resources in the Supporting Materials section, and the resources in the Resources section of this module to help you. Review and analyze the security vulnerabilities specific to Artemis Financial’s web-based software application. Use the Project One Template linked in the What to Submit section to document the following items for your vulnerability assessment report:

Interpreting Client Needs: Review the scenario to determine your client’s needs and potential threats and attacks associated with its application and software security requirements. Document your findings in your vulnerability assessment report. Consider the scenario information and the following questions regarding how companies protect against external threats:
What is the value of secure communications to the company?
Does the company make any international transactions?
Are there governmental restrictions about secure communications to consider?
What external threats might be present now and in the immediate future?
What are the modernization requirements that you must consider? For example:
The role of open-source libraries
Evolving web application technologies
Areas of Security: Use what you have learned in step 1 and refer to the vulnerability assessment process flow diagram provided in the Supporting Materials section. Think about the functionality of the software application to identify which areas of security apply to Artemis Financial’s web application. Document your findings in your vulnerability assessment report and justify why each area is relevant to the software application.

Note: Not all seven areas of security in the vulnerability assessment process flow diagram apply to the company’s software application.
Manual Review: Refer to the seven security areas outlined in the vulnerability assessment process flow diagram. Use what you’ve learned in steps 1 and 2 to guide your manual review. Identify all vulnerabilities in the Project One Code Base linked in the Supporting Materials section by manually inspecting the code. Document at least 7 to 10 findings in your vulnerability assessment report. Include a description that identifies where the vulnerabilities are found. Provide the specific class file, if applicable.
Static Testing: Integrate the dependency-check plug-in into Maven by following the instructions in the Integrating the Maven Dependency-Check Plug-in tutorial provided in the Supporting Materials section. Run a dependency check on Artemis Financial’s software application to identify all security vulnerabilities in the code. Specifically, identify all vulnerabilities in the code base by analyzing results from running the code through a static test. Include the following items from the dependency-check report in your vulnerability assessment report:
The names or vulnerability codes of the known vulnerabilities
A brief description and recommended solutions that are found in the dependency-check report
Any attribution that documents how this vulnerability has been identified or how it was documented in the past
Mitigation Plan: Interpret the results from the manual review and static testing report. Identify steps to mitigate the identified security vulnerabilities by creating an action list that documents how to fix each vulnerability in your vulnerability assessment report.

Note: You do not need to fix these vulnerabilities in this project.
What to Submit
To complete this project, you must submit the following:

Vulnerability Assessment Report
Use the Project One Template to complete your vulnerability assessment report.

---
**Rubric 2**

Competencies
In this project, you will demonstrate your expectations in the following competencies:

Write secure communications through the application of current encryption technologies and techniques
Design and implement code that complies with software security testing protocols
Scenario
You work as a developer for a software engineering company called Global Rain. Global Rain specializes in custom software design and development. The software is for entrepreneurs, businesses, and government agencies around the world. Part of the company’s mission is “Security is everyone’s responsibility.” Global Rain has promoted you to its new agile scrum team.

At Global Rain, you work with a client, Artemis Financial. Artemis Financial is a consulting company that develops individualized financial plans for its customers. The financial plans include savings, retirement, investments, and insurance.

Artemis Financial logo

Artemis Financial wants to modernize its operations. As a crucial part of the success of its custom software, the company also wants to use the most current and effective software security. Artemis Financial has a public web interface. The company is seeking Global Rain’s expertise on how to protect its client data and financial information.

Specifically, Artemis Financial wants to add a file verification step to its web application to ensure secure communications. When the web application is used to transfer data, the company will need a data verification step in the form of a checksum. You must take Artemis Financial’s existing software application and add secure communication mechanisms to meet the company’s software security requirements. You’ll deliver a production- quality integrated application that includes secure coding protocols.

Directions
You must examine Artemis Financial’s software to address any security vulnerabilities. This examination will require you to refactor the Project Two Code Base linked in the Supporting Materials section to add functionality to meet software security requirements for Artemis Financial’s application. Specifically, you must follow the steps outlined below to facilitate your findings and address and remedy all areas. Use the Project Two Template linked in the What to Submit section to document your work for your practices for secure software report. You will also submit zipped files that contain the refactored code. Review this module’s Resources section to help you with this assignment. 

Algorithm Cipher: Recommend an appropriate encryption algorithm cipher to deploy, given the security vulnerabilities, and justify your reasoning. Review the scenario and the supporting materials to support your recommendation. In your practices for secure software report, be certain to address the following actions:
Provide a brief, high-level overview of the encryption algorithm cipher.
Discuss the hash functions and bit levels of the cipher.
Explain the use of random numbers, symmetric versus non-symmetric keys, and so on.
Describe the history and current state of encryption algorithms.
Certificate Generation: Generate appropriate self-signed certificates using the Java Keytool in Eclipse.
Complete the following steps to demonstrate that the certificate was correctly generated:
Export your certificates as a CER file.
Submit a screenshot of the CER file in your practices for secure software report.
Deploy Cipher: Deploy and implement the cryptographic hash algorithm by refactoring code. Demonstrate functionality with a checksum verification.
Submit a screenshot of the checksum verification in your practices for secure software report. The screenshot must show your name and a unique data string that has been created.
Secure Communications: Verify secure communication. In the application properties file, refactor the code to convert HTTP to the HTTPS protocol. Compile and run the refactored code. Once the server is running, type “https://localhost:8443/hash” in a new browser to demonstrate that the secure communication works.
Create a screenshot of the web browser that shows a secure webpage and include it in your practices for secure software report.
Secondary Testing: Run a secondary static testing of the refactored code using the dependency-check tool to make certain the code complies with software security enhancements. You need to focus only on the code you have added as part of the refactoring. Complete the dependency check and review the output to make certain you did not introduce additional security vulnerabilities. Refer to the resources in the module’s Resources section for help on this action. In your practices for secure software report, include the following items:
A screenshot of the refactored code executed without errors
A screenshot of the report of the output from the dependency-check static tester
Functional Testing: Identify the software application's syntactical, logical, and security vulnerabilities by manually reviewing the code.
Complete this functional testing and include a screenshot of the refactored code, executed without errors, in your practices for secure software report.
What if I receive errors or new vulnerabilities?
You will need to iterate on your design and refactored code, address vulnerabilities, and retest until no new vulnerabilities are found.

Summary: Discuss how the code has been refactored and complies with security testing protocols. In the summary of your practices for secure software report, be certain to address the following items:
Refer to the vulnerability assessment process flow diagram in the Supporting Materials section. Highlight the areas of security that you addressed by refactoring the code.
Discuss your process for adding layers of security to the software application.
Industry Standard Best Practices: Explain how you applied industry standard best practices for secure coding to mitigate known security vulnerabilities. Be sure to address the following items:
Explain how you used industry standard best practices to maintain the software application’s existing security.
Explain the value of applying industry standard best practices for secure coding to the company’s overall well-being.
What to Submit
To complete this project, you must submit the following:

Practices for Secure Software Report
Use the Project Two Template to create your report. Submit a comprehensive report of the steps you have taken to increase the layers of security in Artemis Financial’s software application. Also include details about the code files as attachments on the completed report.

CS 305 Project Two Refactored Code Base ZIP file
Refactor the code provided in the Supporting Materials section. Be certain to zip the refactored code into one zipped project folder that contains all files associated with Artemis Financial’s software application. Submit the zipped project folder.

---
**Questions**

(You don't have to read this. This is only for a homework assignment with this repository) 

Briefly summarize your client, Artemis Financial, and its software requirements. Who was the client? What issue did the company want you to address?

- Artemis Finacial is a company that holes finanical Data. This is why it's important to them that Security needs to be in their software application. They wanted me to ensure the saftey of their client and server from outslide threats to prevents MitM attacks. 

What did you do well when you found your client’s software security vulnerabilities? Why is it important to code securely? What value does software security add to a company’s overall well-being?

- I was able to see where the encryption was missing and potential areas where data could be exposed. I added secure communcation like SSL/TLS and check sumverfication to the program to protect that data. It's imporant to code securely as it helps preventing data theft or tampering. It also allows the companies reputiation to be held in high regard as it allows users to know their data is in good hands as well as prevent lawsuits for the company. 

Which part of the vulnerability assessment was challenging or helpful to you?

- To me the hardest part was the sheer Quanitity of the dependency report. The dependency report was huge and every single thing must be looked at in fine detail to ensure there is no vunerabilties. For this assignment luckly we did not need to fix the depedenecy issues. 

How did you increase layers of security? In the future, what would you use to assess vulnerabilities and decide which mitigation techniques to use?

- To increase the layers of security I would immediately address the OWASP dependency check. There is a lot of issues that were not required to be fixed with this assignment but could server as security risk. It also would mitigate the potential risk in the future. 

How did you make certain the code and software application were functional and secure? After refactoring the code, how did you check to see whether you introduced new vulnerabilities?

- I tested the application I wrote by sending and recieving data sent over by the HTTPS then checking if the checksum matched. I also ran OWASP to find new vunerabilties. 

What resources, tools, or coding practices did you use that might be helpful in future assignments or tasks?

- I used Maven to manage Dependencies, OWASP tools for vunerabitly scanning, and spring boot to setup a secure server. These tools are fundemental building blocks for any java based program in the future. 

Employers sometimes ask for examples of work that you have successfully completed to show your skills, knowledge, and experience. What might you show future employers from this assignment?

- I would show them this project as an example of how I implemented encryption. I set it up with HTTPS, with a self signed certificate, Verified Data inegrity with check sums, and used OWASP tools to check for Vulnerabilties. This project is a prime example for any future employeer of what I can do for them.

