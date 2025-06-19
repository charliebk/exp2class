class IfcRelConnectsStructuralActivity extends IfcRelConnects {
    constructor() {
        /** @type {IFCSTRUCTURALACTIVITYASSIGNMENTSELECT} */
        this.RelatingElement = null;
        /** @type {IFCSTRUCTURALACTIVITY} */
        this.RelatedStructuralActivity = null;
    }
}
