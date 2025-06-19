public class IfcApplication {
    public IfcOrganization ApplicationDeveloper;
    public IfcLabel Version;
    public IfcLabel ApplicationFullName;
    public IfcIdentifier ApplicationIdentifier;

    // === UNIQUE CLAUSES ===
    // UR1 : ApplicationIdentifier
    // UR2 : ApplicationFullName, Version
}
