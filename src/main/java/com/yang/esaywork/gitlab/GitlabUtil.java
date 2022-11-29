package com.yang.esaywork.gitlab;

import lombok.SneakyThrows;
import org.gitlab4j.api.CommitsApi;
import org.gitlab4j.api.GitLabApi;
import org.gitlab4j.api.models.Commit;

import java.util.List;

/**
 * @author YangZ
 * @date 2022/11/29
 */
public class GitlabUtil {

    private final GitLabApi gitLabApi;

    public GitlabUtil(String gitlabUrl,String accessToken){
        gitLabApi = new GitLabApi(gitlabUrl,accessToken);
    }

    @SneakyThrows
    public List<String> getCommits(String projectId, String branch){
        CommitsApi commitsApi = gitLabApi.getCommitsApi();
        List<Commit> commits = commitsApi.getCommits(projectId, branch, null);
        return null;
    }

}
