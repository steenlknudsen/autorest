// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace Fixtures.AcceptanceTestsAzureCompositeModelClient.Models
{
    using AcceptanceTestsAzureCompositeModelClient;
    using Newtonsoft.Json;
    using System.Collections;
    using System.Collections.Generic;
    using System.Linq;

    [Newtonsoft.Json.JsonObject("Fish")]
    public partial class FishInner
    {
        /// <summary>
        /// Initializes a new instance of the FishInner class.
        /// </summary>
        public FishInner() { }

        /// <summary>
        /// Initializes a new instance of the FishInner class.
        /// </summary>
        public FishInner(double length, string species = default(string), IList<FishInner> siblings = default(IList<FishInner>))
        {
            Species = species;
            Length = length;
            Siblings = siblings;
        }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "species")]
        public string Species { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "length")]
        public double Length { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "siblings")]
        public IList<FishInner> Siblings { get; set; }

        /// <summary>
        /// Validate the object.
        /// </summary>
        /// <exception cref="Microsoft.Rest.ValidationException">
        /// Thrown if validation fails
        /// </exception>
        public virtual void Validate()
        {
            if (Siblings != null)
            {
                foreach (var element in Siblings)
                {
                    if (element != null)
                    {
                        element.Validate();
                    }
                }
            }
        }
    }
}

