package com.strivers.graphs.bipartite;

import java.util.Arrays;

public class MaximumBipartiteMatchingUsingFordFulkersonAlgorithm {

  //dfs
	public boolean canAssignJob(int applicant, int[][] mat, int[] assignedApplicant, boolean[] visitedJobs){

	  int totalJobs = mat[0].length;
	  for(int job = 0; job < totalJobs; job++){

			if(mat[applicant][job] == 1 && visitedJobs[job] == false){
			  // mat[applicant][job] = 0;
				visitedJobs[job] = true;

				//dfs takes place here
				if(assignedApplicant[job] == -1 || canAssignJob(assignedApplicant[job], mat, assignedApplicant, visitedJobs)){
		      assignedApplicant[job] = applicant;
				  return true;
				}
			}
		}

	  return false;
	}

	public int maxMatch(int[][] mat){

	  int maxMatching = 0;

		int totalApplicants = mat.length;
		int totalJobs = mat[0].length;

		int[] assignedApplicant = new int[totalJobs]; //keeps the applicants that are assigned to each job. Thus mapped with Total number of jobs variable "totalJobs"
		Arrays.fill(assignedApplicant, -1);

		for(int applicant = 0; applicant < totalApplicants; applicant++){

		  boolean[] visitedJobs = new boolean[totalJobs];
		  if(canAssignJob(applicant, mat, assignedApplicant, visitedJobs)){
				maxMatching++;
			}
		}

		return maxMatching;
	}
}
