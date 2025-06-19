public class IfcApplication
{
    public IfcOrganization ApplicationDeveloper { get; set; }
    public IfcLabel Version { get; set; }
    public IfcLabel ApplicationFullName { get; set; }
    public IfcIdentifier ApplicationIdentifier { get; set; }

    // === UNIQUE CLAUSES ===
    // UR1 : ApplicationIdentifier
    // UR2 : ApplicationFullName, Version
}
