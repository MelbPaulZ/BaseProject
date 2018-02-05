package au.com.smedia.baseproject.restfulresponse;

import java.util.List;

import au.com.smedia.baseproject.bean.SmediaIssue;


/**
 * Created by puzhao on 2/2/18.
 */

public class SmediaResponseTitle {

        private String production = "";
        private List<SmediaIssues> issues;
        private List<SmediaIssues> magazines;

        public String getProduction() {
            return production;
        }

        public void setProduction(String production) {
            this.production = production;
        }

        public List<SmediaIssues> getIssues() {
            return issues;
        }

        public void setIssues(List<SmediaIssues> issues) {
            this.issues = issues;
        }

        public List<SmediaIssues> getMagazines() {
            return magazines;
        }

        public void setMagazines(List<SmediaIssues> magazines) {
            this.magazines = magazines;
        }

    public class SmediaIssues{
        private SmediaIssue issue;

        public SmediaIssue getIssue() {
            return issue;
        }

        public void setIssue(SmediaIssue issue) {
            this.issue = issue;
        }
    }


}
