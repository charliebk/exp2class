' SELECT TYPE IfcCoordinateReferenceSystemSelect
' Options:
' - IfcCoordinateReferenceSystem
' - IfcGeometricRepresentationContext
Public Class IfcCoordinateReferenceSystemSelect
    Public ReadOnly Property Value As Object

    Public Sub New(value As Object)
        If Not (TypeOf value Is IfcCoordinateReferenceSystem OrElse TypeOf value Is IfcGeometricRepresentationContext) Then
            Throw New ArgumentException("Value must be one of: IfcCoordinateReferenceSystem, IfcGeometricRepresentationContext")
        End If
        Me.Value = value
    End Sub

    Public Function GetValueAs(Of T)() As T
        Return CType(Value, T)
    End Function
End Class
