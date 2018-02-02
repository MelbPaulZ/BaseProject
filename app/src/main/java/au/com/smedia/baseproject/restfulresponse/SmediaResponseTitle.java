package au.com.smedia.baseproject.restfulresponse;

import java.util.List;

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

    public class SmediaIssue{
        private String date = "";
        private String displaydate = "";
        private String cover = "";
        private String id = "";
        private String pages = "";
        private String size = "";
        private int version = 0;
        private String description = "";
        private String specialid = "";
        private String availableDate = "";
        private String iapIosId = "";
        private String iapAndroidId = "";
        private String iapAmazonId = "";

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getDisplaydate() {
            return displaydate;
        }

        public void setDisplaydate(String displaydate) {
            this.displaydate = displaydate;
        }

        public String getCover() {
            return cover;
        }

        public void setCover(String cover) {
            this.cover = cover;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getPages() {
            return pages;
        }

        public void setPages(String pages) {
            this.pages = pages;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public int getVersion() {
            return version;
        }

        public void setVersion(int version) {
            this.version = version;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getSpecialid() {
            return specialid;
        }

        public void setSpecialid(String specialid) {
            this.specialid = specialid;
        }

        public String getAvailableDate() {
            return availableDate;
        }

        public void setAvailableDate(String availableDate) {
            this.availableDate = availableDate;
        }

        public String getIapIosId() {
            return iapIosId;
        }

        public void setIapIosId(String iapIosId) {
            this.iapIosId = iapIosId;
        }

        public String getIapAndroidId() {
            return iapAndroidId;
        }

        public void setIapAndroidId(String iapAndroidId) {
            this.iapAndroidId = iapAndroidId;
        }

        public String getIapAmazonId() {
            return iapAmazonId;
        }

        public void setIapAmazonId(String iapAmazonId) {
            this.iapAmazonId = iapAmazonId;
        }
    }
}
