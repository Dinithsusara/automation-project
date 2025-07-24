package dto;

import lombok.Data;

import java.util.ArrayList;

@Data
public class UpdateProgramData {

    public int Id;

    public String Name;

    public String Description;

    public int Duration;

    public boolean IsPrivate;

    public String ImageUrl;

    public String GetSocialLink;

    public String ProgramCode;

    public String StartDate;

    public int Status;

    public boolean IsPublish;

    public boolean IsPromoteInApp;

    public String PromotionalText;

    public String EndDate;

    public int Events;

    public int ProgramParticipantCount;

    public ArrayList<Object> ProgramSprints;

    public boolean IsUserJoined;

    public Object FriendsList;

    public String CompanyId;

    public ArrayList<Object> Departments;

    public boolean IsAddEventsToCalendar;

    public String TeamName;

    public String TeamUrl;

    public boolean IsOnGoingProgram;

    public int NumberOfTeams;

    public int TotalMinutesTrained;

    public int TeamId;

    public boolean ShouldRankedByAverageDistance;

    public boolean IsManualEndDate;

    public String ManualEndDate;

    public Object CreatedBy;

    public Object CompanyName;

    public boolean IsRecordingEnable;
}
