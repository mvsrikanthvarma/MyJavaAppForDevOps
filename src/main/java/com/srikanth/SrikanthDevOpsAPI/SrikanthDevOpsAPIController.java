package com.srikanth.SrikanthDevOpsAPI;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SrikanthDevOpsAPIController {
	
	@RequestMapping("DevOpsTools")
	public List<DevOpsTool> getAllDevOpsTools(){
		
		DevOpsTool dockertool = new DevOpsTool("Docker", 23.0, "Docker containeritzaion tool");
		DevOpsTool terraformtool = new DevOpsTool("Terraform", 1.8, "Terraform is IAC tool");
		DevOpsTool kubernetestool = new DevOpsTool("Kubernetes",1.24, "Kubernetes is a container orchestration system");
		
		return Arrays.asList(dockertool, terraformtool, kubernetestool);
		
	}

}
