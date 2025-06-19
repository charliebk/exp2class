public class IfcPostalAddress extends IfcAddress {
    public IfcLabel InternalLocation;
    public List<IfcLabel> AddressLines;
    public IfcLabel PostalBox;
    public IfcLabel Town;
    public IfcLabel Region;
    public IfcLabel PostalCode;
    public IfcLabel Country;

    // === WHERE CLAUSES ===
    // WR1 : EXISTS (InternalLocation) OR EXISTS (AddressLines) OR EXISTS (PostalBox) OR EXISTS (PostalCode) OR EXISTS (Town) OR EXISTS (Region) OR EXISTS (Country)
}
