public class IfcTelecomAddress extends IfcAddress {
    public List<IfcLabel> TelephoneNumbers;
    public List<IfcLabel> FacsimileNumbers;
    public IfcLabel PagerNumber;
    public List<IfcLabel> ElectronicMailAddresses;
    public IfcURIReference WWWHomePageURL;
    public List<IfcURIReference> MessagingIDs;

    // === WHERE CLAUSES ===
    // MinimumDataProvided : EXISTS (TelephoneNumbers) OR EXISTS (FacsimileNumbers) OR EXISTS (PagerNumber) OR EXISTS (ElectronicMailAddresses) OR EXISTS (WWWHomePageURL) OR EXISTS (MessagingIDs)
}
