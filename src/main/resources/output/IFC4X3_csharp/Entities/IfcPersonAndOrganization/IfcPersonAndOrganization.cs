public class IfcPersonAndOrganization
{
    public IfcPerson ThePerson { get; set; }
    public IfcOrganization TheOrganization { get; set; }
    public List<IfcActorRole> Roles { get; set; }
}
