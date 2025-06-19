public class IfcConnectedFaceSet : IfcTopologicalRepresentationItem
{
    public SET [1:?] OF IfcFace CfsFaces { get; set; }

    // === EXTENDED BY ===
    // IfcClosedShell
    // IfcOpenShell
}
