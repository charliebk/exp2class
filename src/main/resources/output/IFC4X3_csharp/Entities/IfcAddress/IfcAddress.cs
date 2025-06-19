public class IfcAddress
{
    public IfcAddressTypeEnum Purpose { get; set; }
    public IfcText Description { get; set; }
    public IfcLabel UserDefinedPurpose { get; set; }

    // === EXTENDED BY ===
    // IfcPostalAddress
    // IfcTelecomAddress

    // === INVERSE CLAUSES ===
    // OfPerson : SET [0:?] OF IfcPerson FOR Addresses
    // OfOrganization : SET [0:?] OF IfcOrganization FOR Addresses

    // === WHERE CLAUSES ===
    // WR1 : (NOT(EXISTS(Purpose))) OR ((Purpose <> IfcAddressTypeEnum.USERDEFINED) OR ((Purpose = IfcAddressTypeEnum.USERDEFINED) AND EXISTS(SELF.UserDefinedPurpose)))
}
