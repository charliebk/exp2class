' SELECT TYPE IfcLightDistributionDataSourceSelect
' Options:
' - IfcExternalReference
' - IfcLightIntensityDistribution
Public Class IfcLightDistributionDataSourceSelect
    Public ReadOnly Property Value As Object

    Public Sub New(value As Object)
        If Not (TypeOf value Is IfcExternalReference OrElse TypeOf value Is IfcLightIntensityDistribution) Then
            Throw New ArgumentException("Value must be one of: IfcExternalReference, IfcLightIntensityDistribution")
        End If
        Me.Value = value
    End Sub

    Public Function GetValueAs(Of T)() As T
        Return CType(Value, T)
    End Function
End Class
