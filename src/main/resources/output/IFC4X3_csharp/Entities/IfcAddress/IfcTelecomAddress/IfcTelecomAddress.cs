public class IfcTelecomAddress : IfcAddress
{
    public List<IfcLabel> TelephoneNumbers { get; set; }
    public List<IfcLabel> FacsimileNumbers { get; set; }
    public IfcLabel PagerNumber { get; set; }
    public List<IfcLabel> ElectronicMailAddresses { get; set; }
    public IfcURIReference WWWHomePageURL { get; set; }
    public List<IfcURIReference> MessagingIDs { get; set; }

    // === WHERE CLAUSES ===
    // MinimumDataProvided : EXISTS (TelephoneNumbers) OR EXISTS (FacsimileNumbers) OR EXISTS (PagerNumber) OR EXISTS (ElectronicMailAddresses) OR EXISTS (WWWHomePageURL) OR EXISTS (MessagingIDs)
}
