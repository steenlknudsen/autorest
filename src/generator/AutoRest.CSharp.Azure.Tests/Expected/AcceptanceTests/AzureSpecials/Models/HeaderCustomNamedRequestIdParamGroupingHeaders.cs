// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace Fixtures.Azure.AcceptanceTestsAzureSpecials.Models
{
    using System.Linq;

    /// <summary>
    /// Defines headers for customNamedRequestIdParamGrouping operation.
    /// </summary>
    public partial class HeaderCustomNamedRequestIdParamGroupingHeaders
    {
        /// <summary>
        /// Initializes a new instance of the
        /// HeaderCustomNamedRequestIdParamGroupingHeaders class.
        /// </summary>
        public HeaderCustomNamedRequestIdParamGroupingHeaders() { }

        /// <summary>
        /// Initializes a new instance of the
        /// HeaderCustomNamedRequestIdParamGroupingHeaders class.
        /// </summary>
        /// <param name="fooRequestId">Gets the foo-request-id.</param>
        public HeaderCustomNamedRequestIdParamGroupingHeaders(string fooRequestId = default(string))
        {
            FooRequestId = fooRequestId;
        }

        /// <summary>
        /// Gets the foo-request-id.
        /// </summary>
        [Newtonsoft.Json.JsonProperty(PropertyName = "foo-request-id")]
        public string FooRequestId { get; set; }

    }
}
