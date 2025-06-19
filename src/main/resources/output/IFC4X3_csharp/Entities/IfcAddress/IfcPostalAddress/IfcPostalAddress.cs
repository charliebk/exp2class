public class IfcPostalAddress : IfcAddress
{
    public IfcLabel InternalLocation { get; set; }
    public List<IfcLabel> AddressLines { get; set; }
    public IfcLabel PostalBox { get; set; }
    public IfcLabel Town { get; set; }
    public IfcLabel Region { get; set; }
    public IfcLabel PostalCode { get; set; }
    public IfcLabel Country { get; set; }

    // === WHERE CLAUSES ===
    // WR1 : EXISTS (InternalLocation) OR EXISTS (AddressLines) OR EXISTS (PostalBox) OR EXISTS (PostalCode) OR EXISTS (Town) OR EXISTS (Region) OR EXISTS (Country)
}
