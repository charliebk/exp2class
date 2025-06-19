public class IfcRelCoversBldgElements extends IfcRelConnects {
    public IfcElement RelatingBuildingElement;
    public SET [1:?] OF IfcCovering RelatedCoverings;
}
